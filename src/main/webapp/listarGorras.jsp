<%@page import="java.util.List"%>
<%@page import="com.sena.sistemagestiongorrasweb.modelo.Gorra"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Gorras</title>
</head>

<body>

    <h1>Lista de Gorras</h1>

    <table border="1">

        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Marca</th>
            <th>Color</th>
            <th>Talla</th>
            <th>Precio</th>
            <th>Stock</th>
            <th>Acciones</th>
        </tr>

        <%
            List<Gorra> listaGorras =
                    (List<Gorra>) request.getAttribute("listaGorras");

            if (listaGorras != null) {

                for (Gorra gorra : listaGorras) {
        %>

        <tr>
            <td><%= gorra.getIdgorra() %></td>
            <td><%= gorra.getNombre() %></td>
            <td><%= gorra.getMarca() %></td>
            <td><%= gorra.getColor() %></td>
            <td><%= gorra.getTalla() %></td>
            <td><%= gorra.getPrecio() %></td>
            <td><%= gorra.getStock() %></td>
            <td>
    <form action="EliminarGorraServlet" method="post">
        <input type="hidden" name="idgorra" value="<%= gorra.getIdgorra() %>">
        <input type="submit" value="Eliminar">
    </form>
</td>
        </tr>

        <%
                }
            }
        %>

    </table>

</body>
</html>