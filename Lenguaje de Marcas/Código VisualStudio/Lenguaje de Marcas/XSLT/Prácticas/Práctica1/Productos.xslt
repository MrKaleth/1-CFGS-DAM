<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Reporte de Productos</title>
                <style>
                    table {
                        width: 100%;
                        border-collapse: collapse;
                    }
                    th, td {
                        border: 1px solid black;
                        padding: 12px;
                    }
                    th {
                        text-align: center;
                        background-color: #ede4e4
                    }
                    td {
                        text-align: left;
                    }
                </style>
            </head>
            <body>
                <h1>Reporte de Productos</h1>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Categoría</th>
                        <th>Precio</th>
                        <th>Stock</th>
                    </tr>

                    <xsl:for-each select="productos/producto">
                        <xsl:sort select="@id" data-type="number" order="ascending"/>
                        <tr>
                            <td><xsl:value-of select="@id"/></td>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="categoria"/></td>
                            <td><xsl:value-of select="precio"/></td>
                            <td><xsl:value-of select="stock"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
