package ejerciciosCodificacion.HerenciaListaNumerica;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {

    public Integer first() {
        if (this.isEmpty()) {
            return null;
        }
        return this.get(0);
    }

    public Integer last() {
        if (this.isEmpty()) {
            return null;
        }
        return this.get(this.size() - 1);
    }

    public int sum() {
        int total = 0;
        for (Integer n : this) {
            total += n;
        }
        return total;
    }

    @Override
    public boolean add(Integer e) {
        if (!this.contains(e)) {
            return super.add(e);
        }
        return false;
    }
}
