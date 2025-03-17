<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <body>
                <h2>Cesta</h2>
                <table border="1">
                    <tr bgcolor="#008b76">
                        <th>ID Producto</th>
                        <th>Nombre</th>
                        <th>Origen</th>
                        <th>Cantidad</th>
                        <th>Costo</th>
                        <th>Importaciones</th>
                    </tr>

                    <xsl:for-each select="canasta/producto">
                    <xsl:sort select="number(costo)" data-type="number" order="ascending"/>
                    <!-- <xsl:if test="cantidad>=20">a -->
                    
                    
                        <tr>
                            <td><xsl:value-of select="@IDProducto"/></td>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="origen"/></td>
                            <td><xsl:value-of select="cantidad"/></td>
                            <td><xsl:value-of select="costo"/></td>
                            <td>
                            <xsl:choose>
                                <xsl:when test="origen='Mexico'">Nacional</xsl:when>
                                <xsl:when test="origen='Italia'">Importado de Europa</xsl:when>
                                <xsl:otherwise>Importado de América</xsl:otherwise>
                            </xsl:choose>
                            </td>
                        </tr>
                   <!-- </xsl:if> -->
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
