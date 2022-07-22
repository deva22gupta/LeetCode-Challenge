There are two places can be improved in the isValid() method. See detail below:
​
Don't need to check whether the a cell in the row, col or region is not dot. Just check these cells are not c is enough. Since c will not be a '.'
Define region start row and region start col variables make the code a bit more readable and reduce 8 times duplicate computing in each call.
​