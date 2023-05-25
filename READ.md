以下是一个 $3\times 3$ 矩阵的行列式的例子：

$$
\begin{vmatrix}
1 & 2 & 3\
4 & 5 & 6\
7 & 8 & 9\
\end{vmatrix}
$$

按照行列式的定义，可以将其展开为三个 $2\times 2$ 子行列式的和，如下所示：

$$
\begin{vmatrix}
1 & 2 & 3 \

4 & 5 & 6 \

7 & 8 & 9 \
\end{vmatrix}
=1\times\begin{vmatrix}5&6\8&9\end{vmatrix}-2\times\begin{vmatrix}4&6\7&9\end{vmatrix}+3\times\begin{vmatrix}4&5\7&8\end{vmatrix}
$$

接下来，可以计算每个 $2\times 2$ 子行列式的值：

$$
\begin{vmatrix}5&6\8&9\end{vmatrix}=5\times9-6\times8=-3
$$

$$
\begin{vmatrix}4&6\7&9\end{vmatrix}=4\times9-6\times7=-6
$$

$$
\begin{vmatrix}4&5\7&8\end{vmatrix}=4\times8-5\times7=-3
$$

将以上结果代入原式，得到：

$$
\begin{vmatrix}
1 & 2 & 3 \
4 & 5 & 6 \
7 & 8 & 9 \
\end{vmatrix}
=1\times(-3)-2\times(-6)+3\times(-3)=-18
$$

因此，该 $3\times 3$ 矩阵的行列式的值为 $-18$。

