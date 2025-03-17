'''
import pygame
import random
import os

# Inicializar pygame
pygame.init()

# Configuración de la pantalla
WIDTH, HEIGHT = 800, 600
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Esquiva los cuchillos y recoge cigarrillos")

# Colores
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)

# Cargar imágenes
assets_path = os.path.join(os.path.dirname(__file__), "assets")
player_img = pygame.image.load(os.path.join(assets_path, r"C:\Users\dbonper\Desktop\1ºCFGS DAM\Distractions\Experimentos\images.png"))
knife_img = pygame.image.load(os.path.join(assets_path, r"C:\Users\dbonper\Desktop\1ºCFGS DAM\Distractions\Experimentos\3d-icon-of-knife-free-png.webp"))
cigarette_img = pygame.image.load(os.path.join(assets_path, r"C:\Users\dbonper\Desktop\1ºCFGS DAM\Distractions\Experimentos\Cigarette_DS.jpg"))
player_img = pygame.transform.scale(player_img, (50, 50))
knife_img = pygame.transform.scale(knife_img, (40, 60))
cigarette_img = pygame.transform.scale(cigarette_img, (30, 30))

# Jugador
player = pygame.Rect(WIDTH//2, HEIGHT-60, 50, 50)
player_speed = 5

# Cuchillos
knives = []
knife_speed = 3
knife_spawn_timer = 0

# Cigarrillos
cigarettes = []
cigarette_spawn_timer = 0
score = 0

# Fuente
font = pygame.font.Font(None, 36)

# Función para mostrar el menú de inicio
def show_start_menu():
    screen.fill(WHITE)
    title_text = font.render("Esquiva los cuchillos y recoge cigarrillos", True, GREEN)
    start_text = font.render("Presiona ENTER para empezar", True, RED)
    
    screen.blit(title_text, (WIDTH//2 - title_text.get_width()//2, HEIGHT//3))
    screen.blit(start_text, (WIDTH//2 - start_text.get_width()//2, HEIGHT//2))
    
    pygame.display.flip()

# Función para mostrar la pantalla de Game Over
def show_game_over():
    screen.fill(WHITE)
    game_over_text = font.render("¡Game Over!", True, RED)
    score_text = font.render(f"Puntuación final: {score}", True, GREEN)
    restart_text = font.render("Presiona ENTER para reiniciar", True, RED)
    
    screen.blit(game_over_text, (WIDTH//2 - game_over_text.get_width()//2, HEIGHT//3))
    screen.blit(score_text, (WIDTH//2 - score_text.get_width()//2, HEIGHT//2))
    screen.blit(restart_text, (WIDTH//2 - restart_text.get_width()//2, HEIGHT*2//3))
    
    pygame.display.flip()

# Bucle principal
running = True
in_game = False
clock = pygame.time.Clock()

while running:
    if not in_game:
        show_start_menu()
        
        # Espera a que el jugador presione ENTER para empezar
        waiting_for_start = True
        while waiting_for_start:
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    running = False
                    waiting_for_start = False
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_RETURN:
                        in_game = True
                        score = 0
                        knife_speed = 3
                        knives.clear()
                        cigarettes.clear()
                        waiting_for_start = False

    else:
        screen.fill(WHITE)
        
        # Eventos
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
                in_game = False
        
        # Movimiento del jugador
        keys = pygame.key.get_pressed()
        if keys[pygame.K_LEFT] and player.x > 0:
            player.x -= player_speed
        if keys[pygame.K_RIGHT] and player.x < WIDTH - player.width:
            player.x += player_speed
        
        # Generar cuchillos
        knife_spawn_timer += 1
        if knife_spawn_timer > 30:
            knives.append(pygame.Rect(random.randint(0, WIDTH-40), 0, 40, 60))
            knife_spawn_timer = 0
        
        # Mover cuchillos
        for knife in knives[:]:
            knife.y += knife_speed
            if knife.colliderect(player):
                show_game_over()
                in_game = False
            if knife.y > HEIGHT:
                knives.remove(knife)
        
        # Generar cigarrillos
        cigarette_spawn_timer += 1
        if cigarette_spawn_timer > 100:
            cigarettes.append(pygame.Rect(random.randint(0, WIDTH-30), 0, 30, 30))
            cigarette_spawn_timer = 0
        
        # Mover cigarrillos
        for cigarette in cigarettes[:]:
            cigarette.y += 2
            if cigarette.colliderect(player):
                score += 1
                cigarettes.remove(cigarette)
            elif cigarette.y > HEIGHT:
                cigarettes.remove(cigarette)
        
        # Dibujar elementos
        screen.blit(player_img, (player.x, player.y))
        for knife in knives:
            screen.blit(knife_img, (knife.x, knife.y))
        for cigarette in cigarettes:
            screen.blit(cigarette_img, (cigarette.x, cigarette.y))
        
        # Mostrar puntuación
        score_text = font.render(f"Puntos: {score}", True, GREEN)
        screen.blit(score_text, (10, 10))
        
        # Aumentar dificultad
        knife_speed += 0.001
        
        pygame.display.flip()
        clock.tick(30)

pygame.quit()
'''

import pygame
import random
import os

# Inicializar pygame
pygame.init()

# Configuración de la pantalla
WIDTH, HEIGHT = 800, 600
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Esquiva los cuchillos y recoge cigarrillos")

# Colores
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLACK = (0, 0, 0)

# Cargar imágenes y sonidos
assets_path = os.path.join(os.path.dirname(__file__), "assets")
player_img = pygame.image.load(os.path.join(assets_path, r"C:\Users\dbonper\Desktop\1ºCFGS DAM\Distractions\Experimentos\images.png"))
knife_img = pygame.image.load(os.path.join(assets_path, r"C:\Users\dbonper\Desktop\1ºCFGS DAM\Distractions\Experimentos\3d-icon-of-knife-free-png.webp"))
cigarette_img = pygame.image.load(os.path.join(assets_path, r"C:\Users\dbonper\Desktop\1ºCFGS DAM\Distractions\Experimentos\Cigarette_DS.jpg"))
player_img = pygame.transform.scale(player_img, (50, 50))
knife_img = pygame.transform.scale(knife_img, (40, 60))
cigarette_img = pygame.transform.scale(cigarette_img, (30, 30))

# Sonidos
pygame.mixer.init()
collect_sound = pygame.mixer.Sound(os.path.join(assets_path, "collect.wav"))
hit_sound = pygame.mixer.Sound(os.path.join(assets_path, "hit.wav"))

# Jugador
class Player:
    def __init__(self):
        self.rect = pygame.Rect(WIDTH // 2, HEIGHT - 60, 50, 50)
        self.speed = 5
        self.lives = 3

    def move(self, keys):
        if keys[pygame.K_LEFT] and self.rect.x > 0:
            self.rect.x -= self.speed
        if keys[pygame.K_RIGHT] and self.rect.x < WIDTH - self.rect.width:
            self.rect.x += self.speed

    def draw(self, screen):
        screen.blit(player_img, (self.rect.x, self.rect.y))

# Cuchillos
class Knife:
    def __init__(self):
        self.rect = pygame.Rect(random.randint(0, WIDTH - 40), 0, 40, 60)
        self.speed = 3

    def move(self):
        self.rect.y += self.speed

    def draw(self, screen):
        screen.blit(knife_img, (self.rect.x, self.rect.y))

# Cigarrillos
class Cigarette:
    def __init__(self):
        self.rect = pygame.Rect(random.randint(0, WIDTH - 30), 0, 30, 30)
        self.speed = 2

    def move(self):
        self.rect.y += self.speed

    def draw(self, screen):
        screen.blit(cigarette_img, (self.rect.x, self.rect.y))

# Función para mostrar el menú de inicio
def show_start_menu():
    screen.fill(WHITE)
    title_text = font.render("Esquiva los cuchillos y recoge cigarrillos", True, GREEN)
    start_text = font.render("Presiona ENTER para empezar", True, RED)
    
    screen.blit(title_text, (WIDTH // 2 - title_text.get_width() // 2, HEIGHT // 3))
    screen.blit(start_text, (WIDTH // 2 - start_text.get_width() // 2, HEIGHT // 2))
    
    pygame.display.flip()

# Función para mostrar la pantalla de Game Over
def show_game_over(score):
    screen.fill(WHITE)
    game_over_text = font.render("¡Game Over!", True, RED)
    score_text = font.render(f"Puntuación final: {score}", True, GREEN)
    restart_text = font.render("Presiona ENTER para reiniciar", True, RED)
    
    screen.blit(game_over_text, (WIDTH // 2 - game_over_text.get_width() // 2, HEIGHT // 3))
    screen.blit(score_text, (WIDTH // 2 - score_text.get_width() // 2, HEIGHT // 2))
    screen.blit(restart_text, (WIDTH // 2 - restart_text.get_width() // 2, HEIGHT * 2 // 3))
    
    pygame.display.flip()

# Bucle principal
running = True
in_game = False
clock = pygame.time.Clock()
font = pygame.font.Font(None, 36)

player = Player()
knives = []
cigarettes = []
score = 0
knife_spawn_timer = 0
cigarette_spawn_timer = 0

while running:
    if not in_game:
        show_start_menu()
        
        # Espera a que el jugador presione ENTER para empezar
        waiting_for_start = True
        while waiting_for_start:
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    running = False
                    waiting_for_start = False
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_RETURN:
                        in_game = True
                        score = 0
                        player.lives = 3
                        knives.clear()
                        cigarettes.clear()
                        waiting_for_start = False

    else:
        screen.fill(WHITE)
        
        # Eventos
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
                in_game = False
        
        # Movimiento del jugador
        keys = pygame.key.get_pressed()
        player.move(keys)
        
        # Generar cuchillos
        knife_spawn_timer += 1
        if knife_spawn_timer > 30:
            knives.append(Knife())
            knife_spawn_timer = 0
        
        # Mover cuchillos
        for knife in knives[:]:
            knife.move()
            if knife.rect.colliderect(player.rect):
                hit_sound.play()
                player.lives -= 1
                knives.remove(knife)
                if player.lives <= 0:
                    show_game_over(score)
                    in_game = False
            if knife.rect.y > HEIGHT:
                knives.remove(knife)
        
        # Generar cigarrillos
        cigarette_spawn_timer += 1
        if cigarette_spawn_timer > 100:
            cigarettes.append(Cigarette())
            cigarette_spawn_timer = 0
        
        # Mover cigarrillos
        for cigarette in cigarettes[:]:
            cigarette.move()
            if cigarette.rect.colliderect(player.rect):
                collect_sound.play()
                score += 1
                cigarettes.remove(cigarette)
            elif cigarette.rect.y > HEIGHT:
                cigarettes.remove(cigarette)
        
        # Dibujar elementos
        player.draw(screen)
        for knife in knives:
            knife.draw(screen)
        for cigarette in cigarettes:
            cigarette.draw(screen)
        
        # Mostrar puntuación y vidas
        score_text = font.render(f"Puntos: {score}", True, GREEN)
        lives_text = font.render(f"Vidas: {player.lives}", True, RED)
        screen.blit(score_text, (10, 10))
        screen.blit(lives_text, (WIDTH - 120, 10))
        
        # Aumentar dificultad
        for knife in knives:
            knife.speed += 0.001
        
        pygame.display.flip()
        clock.tick(30)

pygame.quit()
