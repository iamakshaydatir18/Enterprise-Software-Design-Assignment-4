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
        <h2>Movie Search</h2>
    <form action="/HW4/movieServlet.htm" method="POST">
        <label for="searchKeyword">Search by Keyword:</label>
        <input type="text" id="searchKeyword" name="keyword" required>
        
        <br><br>
        <label>Search by:</label>
        <br><br>
        <input type="radio" id="searchByMovieName" name="searchType" value="title" checked>
        <label for="searchByMovieName">search by Title</label>
        <br><br><!-- comment -->
        
        <input type="radio" id="searchByActors" name="searchType" value="actor">
        <label for="searchByActors">search by Actor</label>
        <br><br>
        
        <input type="radio" id="searchByActress" name="searchType" value="actress">
        <label for="searchByActors">search by Actress</label>
        <br><br>
        
        <input type="hidden" name="browse" value="search">
        <br><br>
        <input type="submit" value="Search">
    </form>
        <a href="http://localhost:8080/HW4/index.htm">Visit back to Main Menu</a>
    </body>
</html>
