<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Gorra</title>
</head>

<body>

    <h1>Editar Gorra</h1>

    <form action="EditarGorraServlet" method="post">

        <label>ID de la gorra:</label><br>
        <input type="number" name="idgorra" required><br><br>

        <label>Nombre:</label><br>
        <input type="text" name="nombre" required><br><br>

        <label>Marca:</label><br>
        <input type="text" name="marca" required><br><br>

        <label>Color:</label><br>
        <input type="text" name="color" required><br><br>

        <label>Talla:</label><br>
        <input type="text" name="talla" required><br><br>

        <label>Precio:</label><br>
        <input type="number" step="0.01" name="precio" required><br><br>

        <label>Stock:</label><br>
        <input type="number" name="stock" required><br><br>

        <input type="submit" value="Actualizar">

    </form>

    <br>

    <a href="ListarGorrasServlet">Volver a la lista</a>

</body>
</html>