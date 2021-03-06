# HH-TASKS
Тестовые задания для отбора в Школу программистов HeadHunter

<h3>HH TASK #1</h3>
<h5>Постановка задачи</h5>
Даны N точек на плоскости (для простоты можно считать, 
что у всех точек целочисленные координаты). Назовём расстояние от точки A 
до ближайшей к ней точки B "радиусом" точки A. "Соседями" точки A будем называть 
все точки, лежащие в пределах двойного радиуса от неё включительно
(кроме самой точки A).
<h5>Решение</h5>

Координаты точек задаются случайным образом. 

Поиск радиусов:<br>
для всех точек задается начальный радиус startRadius = 1;<br>
далее идет проверка, принадлежат ли каждой полученной окружности остальные точки;<br>
если ближайших точек в заданном радиусе не обнаружено, радиусы окружностей инкрементируются;<br>
при нахождении ближайшей точки считается расстояние от центра рассматриваемой окружности до центра ближайшей точки и полученное расстояние задается итоговым радиусом точки (окружности).<br>
<br>
Поиск "соседей":<br>
каждой точке задается полученный двойной радиус;<br>
проверяется сколько точек принадлежит полученной окружности;<br>
количество соседей считается инкрементом neighborsCount.<br>
<br>
Для наглядности реализован графический интерфейс. Число N вводится в textbox и отрисовка происходит по нажатию кнопки.
Информация о каждой точке (координаты, радиусы, количество соседей) выводятся в консоль.

<h3>HH TASK #2</h3>
<h5>Постановка задачи</h5>
Возьмём бесконечную цифровую последовательность, образованную склеиванием последовательных 
положительных чисел: S = 123456789101112131415...
Определите первое вхождение заданной последовательности A в бесконечной 
последовательности S (нумерация начинается с 1).<br>

Пример входных данных:<br>
6789<br>
111<br>
<br>
Пример выходных данных:<br>
6<br>
12<br>
<h5>Решение</h5>

Последовательность А вводится пользователем в консоль. Реализована проверка вводимого числа. "Точка" вхождения находится путем сопаставления методом indexOf() введенной последовательности с экземпляром класса StringBuffer, в котором генерируется бесконечность S. 
