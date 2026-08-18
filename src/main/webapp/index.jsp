<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <title>Sistema de Gestión de Gorras</title>

</head>

<body>

    <h1>Sistema de Gestión de Gorras</h1>

    <form action="RegistrarServlet" method="post">

        <label>Nombre:</label><br>
        <input type="text" name="nombre"><br><br>

        <label>Marca:</label><br>
        <input type="text" name="marca"><br><br>

        <label>Color:</label><br>
        <input type="text" name="color"><br><br>

        <label>Talla:</label><br>
        <input type="text" name="talla"><br><br>

        <label>Precio:</label><br>
        <input type="number" step="0.01" name="precio"><br><br>

        <label>Stock:</label><br>
        <input type="number" name="stock"><br><br>

        <input type="submit" value="Registrar">

    </form>

</body>

</html>