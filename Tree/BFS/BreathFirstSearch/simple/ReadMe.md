```
        1
      /    \
     2      3
     |  \   |
     4  --- 5
      \    /
        6

           1   2   3   4   5   6
visited: | 0 | 0 | 0 | 0 | 0 | 0 |
queue :  0

       (1)
      /    \
     2      3
     |  \   |
     4  --- 5
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 0 | 0 | 0 | 0 | 0 |
queue :  1


        (1)
      /    \
     2      3
     |  \   |
     4  --- 5
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 0 | 0 | 0 | 0 | 0 |
queue :
print : 1



       (1)
      /    \
     (2)    (3)
     |  \   |
     4  --- 5
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 0 | 0 | 0 |
queue :  2  3
print : 1


       (1)
      /    \
     (2)    (3)
     |  \   |
     4  --- 5
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 0 | 0 | 0 |
queue :  2  3
print : 1


       (1)
      /    \
    (2)    (3)
     |  \   |
    (4)  --- (5)
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 1 | 1 | 0 |
queue :  3 4 5
print : 1 2

        (1)
      /    \
    (2)    (3)
     |  \   |
    (4)  --- (5)
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 1 | 1 | 0 |
queue :  4 5
print : 1 2 3


        (1)
      /    \
    (2)    (3)
     |  \   |
    (4) --- (5)
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 1 | 1 | 0 |
queue :   5
print : 1 2 3 4

        (1)
      /    \
    (2)    (3)
     |  \   |
    (4) --- (5)
      \    /
        6

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 1 | 1 | 0 |
queue :   5 6
print : 1 2 3 4


        (1)
      /    \
    (2)    (3)
     |  \   |
    (4)  --- (5)
      \    /
        (6)

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 1 | 1 | 1 |
queue :  6
print : 1 2 3 4 5


       (1)
      /    \
    (2)    (3)
     |  \   |
    (4)  --- (5)
      \    /
        (6)

           1   2   3   4   5   6
visited: | 1 | 1 | 1 | 1 | 1 | 1 |
queue :
print : 1 2 3 4 5 6

```
