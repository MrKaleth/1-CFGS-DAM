<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
    <xsl:output method="html" indent="yes" />

    <xsl:template match="/">
        <html>
            <head>
                <title>Reporte de Productos - Agrupados por Categoría (XSLT 2.0)</title>
                <style>
                    body {
                        font-family: Arial, Helvetica, sans-serif;
                    }
                
                    table {
                        width: 100%;
                        border-collapse: collapse;
                    }

                    th, td {
                        border: 1px solid #ccc;
                        padding: 12px;
                        text-align: center;
                    }

                    .rojo { 
                        color: red; 
                        font-weight: bold; 
                    }

                    .verde { 
                        color: green; 
                        font-weight: bold; 
                    }
                    
                </style>
            </head>
            <body>
                <h1>Reporte de Productos Agrupados por Categoría (XSLT 2.0)</h1>

                <xsl:for-each-group select="productos/producto" group-by="categoria">
                    <h2>Categoría: <xsl:value-of select="current-grouping-key()"/></h2>
                    
                    <table>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>Stock</th>
                        </tr>
                        
                        <xsl:for-each select="current-group()">
                            <xsl:sort select="precio" data-type="number" order="ascending"/>
                            <tr>
                                <td><xsl:value-of select="@id"/></td>
                                <td><xsl:value-of select="nombre"/></td>
                                <td>
                                    <xsl:choose>
                                        <xsl:when test="precio &gt; 500">
                                            <span class="rojo"><xsl:value-of select="precio"/></span>
                                        </xsl:when>
                                        <xsl:when test="precio &lt; 200">
                                            <span class="verde"><xsl:value-of select="precio"/></span>
                                        </xsl:when>
                                        <xsl:otherwise>
                                            <xsl:value-of select="precio"/>
                                        </xsl:otherwise>
                                    </xsl:choose>
                                </td>
                                <td><xsl:value-of select="stock"/></td>
                            </tr>
                        </xsl:for-each>
                        <td colspan="4">
                        <i>Total productos: <xsl:value-of select="count(current-group())"/> | 
                        Stock total: <xsl:value-of select="sum(current-group()/stock)"/></i>
                        </td>
                    </table>
                </xsl:for-each-group>

                <p>Fin del reporte</p>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>