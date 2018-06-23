## Queen Attack

Given the position of two queens on a chess board, indicate whether or not they are positioned so that they can attack each other.

In the game of chess, a queen can attack pieces which are on the same row, column, or diagonal.

A chessboard can be represented by an 8 by 8 array.

So if you're told the white queen is at (2, 3) and the black queen at (5, 6), then you'd know you've got a set-up like so:

```
0 _ _ _ _ _ _ _ _
1 _ _ _ _ _ _ _ _
2 _ _ _ W _ _ _ _
3 _ _ _ _ _ _ _ _
4 _ _ _ _ _ _ _ _
5 _ _ _ _ _ _ B _
6 _ _ _ _ _ _ _ _
7 _ _ _ _ _ _ _ _
```

You'd also be able to answer whether the queens can attack each other. In this case, that answer would be yes, they can, because both pieces share a diagonal.