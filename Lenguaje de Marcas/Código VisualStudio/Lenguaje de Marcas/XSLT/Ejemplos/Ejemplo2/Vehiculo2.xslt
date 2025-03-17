<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <body>
                <h1>Ficha de Vehículos</h1>
                <table border="1">
                    <tr bgcolor="#008b76">
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Año</th>
                        <th>Precio</th>
                        <th>Web</th>
                    </tr>

                    <xsl:for-each select="vehiculos/vehiculo">
                        <xsl:sort select="modelo/@año" data-type="number" order="descending"/>
                        <tr>
                            <td><xsl:value-of select="marca"/></td>
                            <td><xsl:value-of select="modelo"/></td>
                            <td><xsl:value-of select="modelo/@año"/></td>
                            <td><xsl:value-of select="precio"/></td>
                            <td><a href="{web}" target="_blank"><xsl:value-of select="web"/></a></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
