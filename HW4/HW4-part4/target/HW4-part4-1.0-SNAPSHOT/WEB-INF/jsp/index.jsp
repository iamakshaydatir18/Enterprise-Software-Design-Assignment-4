<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="/HW4/movieBrowse.htm" method="POST">
            <h1>Welcome to Our Movie Store!</h1>
            <br>
            <h2>Please make your Selection below</h2>
            <label for="dropdown">Select a choice:</label>
            <select name="browse" id="dropdown">
                <option value="" selected disabled>Select</option>
                <option value="browse">Browse Movies</option>
                <option  value="add">Add Item Movie to Database</option>
            </select>
            <input type="Submit" value="Send"/>
        </form>  
    </body>
</html>
