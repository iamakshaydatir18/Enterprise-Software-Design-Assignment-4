<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1> Please Add the details below : </h1>
        <form action="/HW4/movieServlet.htm" method="POST">
            <label for="movieName">Movie Title:</label>
            <input type="text" id="movieName" name="title" required>
            <br><br>
            
            <label for="movieName">Lead Actor:</label>
            <input type="text" id="movieName" name="actor" required>
            <br><br>
            
            <label for="movieName">Lead Actress:</label>
            <input type="text" id="movieName" name="actress" required>
            <br><br>

            <label for="genre">Genre:</label>
            <input type="text" id="genre" name="genre" required>
            <br><br>

            <label for="releaseYear">Year:</label>
            <input type="number" id="releaseYear" name="Year" required>
            <br><br>
            <input type="hidden" name="browse" value="addMovie">
            <input type="submit" value="Add">
        </form>
        <br>
        <a href="http://localhost:8080/HW4/index.htm">Visit back to Main Menu</a>
    </body>
</html>
