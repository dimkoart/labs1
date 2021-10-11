# Introduction to Testing

## Функциональное тестирование сайта [IQ Option](https://iqoption.com/ru)



### 1 *Добавление пары в избранное*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 1                                                            |
| **Заголовок**                                                | Добавление пары в избранное                                  |
| **Предусловие**                                              | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт, открыта пара EUR/RUS |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| В левой части экрана открыт список с доступными открытыми парами валюты. нажать на звезду нужной нам пары | Кнопка звезды загорелась золотым цветом.                     |
| В верхнем меню страницы нажать на кнопку "Избранное"         | сортируется список , на которой находится строка с названием "EUR/USD" |



### 2 *Изменение торговой пары*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 2                                                            |
| **Заголовок**                                                | Изменение торговой пары                                      |
| **Предусловие**                                              | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| В верхнем меню страницы нажать на  поисковую строку и найти EURUSD | сортируется список , на которой находится строка с названием "EUR/USD" |
| нажимаем на золотую звезду этой пары                         | звезда стала прозрачной                                      |
| очищаем поисковую строку                                     | вкладка избранное стала пустой                               |



### 3 *ставка на отложенную закупку *

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 3                                                            |
| **Заголовок**                                                | ставка на отложенную закупку                                 |
| **Предусловие**                                              | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт, открыта пара EURUSD. Исходный баланс 10000$ |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| в центре экрана есть поле для ввода размера позиции и ввели 10 | В поле "выберите размер позиции " отобразилось 10            |
| в центре экрана кнопки "купить, позиция"                     | в нижней части экрана появится информация о нашей ставке и о текущей прибыли. |
| Нажать на закрыть                                            | в центре экрана появиться информация о прибыли в "-20$" нажимаем "да" и со счета списывается двадцать долларов |



### 4 *установка значений тейк профит и стоп лосс*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 4                                                            |
| **Заголовок**                                                | Отмена ставки на Digital                                     |
| **Предусловие**                                              | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт, открыта пара EURUSD. Исходный баланс 99.980$ |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| В правом нижнем углу страницы нажимает на "тп " или "сл"     | появляется окно для выставления значений                     |
| нажмаем на галочку "установить стоп лосс" и "установить тейк профит " | На графике страницы появилась точки места остановки графика  |
| указываем нужные для себя значений                           | в строке появилось нужное нам значение                       |
| нажимает отправить изменения                                 | В правом нижнем углу страницы вместо  "тп " или "сл" появились введенные нами значения |



### 5 *Ставка "Выше" и "Ниже" одновременно*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 5                                                            |
| **Заголовок**                                                | Ставка "Выше" и "Ниже" одновременно                          |
| **Предусловие**                                              | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт, открыта пара EUR/JPY. Исходный баланс 11,682.72$ |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| В правом меню страницы указать сумму ставки 10$ в поле "Сумма" | В поле "Сумма" отобразилось 10$                              |
| В правом меню нажать кнопку "Выше"                           | На графике страницы появилась точка, означающая место ставки, график продолжился |
| В правом меню нажать кнопку "Ниже"                           | На графике страницы появилась вторая точка, означающая место второй ставки, график продолжился, дошел до времени экспирации опциона, кнопки "Выше" и "Ниже" правого меню пропали, на их месте появилась кнопка "Новый опцион". Когда график дошел до линии закрытия сделки на графике появилось окно "Результат" с указанной суммой (график пошел выше места ставки, ставка "Выше" выиграла (сумма выигрыша 187%)), полученной от сделки. Баланс: 11,682.72$ - 10$ - 10$ + 18.71$ = 11,681.43$ |
| Нажать на крестик находящийся рядом с окном "Результат" на графике | Окно "Результат" закрылось. Экран продолжил следовать за графиком |



### 6 *Ставка больше баланса*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 6                                                            |
| **Заголовок**                                                | Ставка больше баланса                                        |
| **Предусловие**                                              | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт, открыта пара EUR/JPY. Исходный баланс 11,681.43$ |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| в центре экрана есть поле для ввода размера позиции и ввели 100000 | В поле "размер позиции" отобразилось 100000                  |
| нажать на кнопку "купить" и на "позиция"                     | кнопка "позиция" является не активной из-за не корректно введенной суммы |
|                                                              |                                                              |



### 7 *Ставка 0$*

| Название                                 | Описание                                                     |
| ---------------------------------------- | ------------------------------------------------------------ |
| **Номер тест-кейса**                     | 7                                                            |
| **Заголовок**                            | Ставка 0$                                                    |
| **Предусловие**                          | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт, открыта пара EUR/JPY |
| **Шаг**                                  | **Ожидаемый результат**                                      |
| 00                                       | В поле "размер позиции" отобразилось 00                      |
| нажать на кнопку "купить" и на "позиция" | кнопка "позиция" является не активной из-за не корректно введенной суммы |



### 8 *экспирация отложенной закупки*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 8                                                            |
| **Заголовок**                                                | экспирация отложенной закупки                                |
| **Предусловие**                                              | Открыта страница [trade](https://www.investmarkets.com/international/ru/trade/), реализован вход в аккаунт, открыто окно traderoom. Исходный баланс 11,665.32$ |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| в верхней части экрана нажать на продвинутый трейдинг        | появяться дополнительные настройки для отложенной закупки    |
| указываем количество позиций , продать или купить , в поле экспирация указываем нужную нам дату завершения | в поле дата экспирация появиться нужная нам дата             |
| нажимаем разместить ордер                                    | в нижней части экрана появиться новый ордер, который закончиться по истечению указанного времени |
|                                                              |                                                              |



### 9 *Тейк-профит Bitcoin*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 9                                                            |
| **Заголовок**                                                | Тейк-профит Bitcoin                                          |
| **Предусловие**                                              | Открыта страница [trade](https://iqoption.com/traderoom), реализован вход в аккаунт, открыто окно Bitcoin. Исходный баланс 11,178.67$ |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| В правом меню страницы указать количество криптовалюты 0.01 в поле "Кол-во" | В поле "Кол-во" отобразилось 0.01                            |
| В правом меню страницы указать тейк-профит 48534.750 в поле "ТП" | В поле "ТП" правого меню отобразился тейк-профит 48534.750   |
| Нажать кнопку "Купить" в правом меню                         | На графике отобразилась точка, обозначающая время покупки, спустя время график дошел до горизонтальной линии "ТП" и сделка закрылась. Баланс: 11,178.67$ - 484.55$ + 485.35$ = 11,179.47$ |



### 10 *просмотр всех трейдов за определенный промежуток врмени*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 10                                                           |
| **Заголовок**                                                | просмотр всех трейдов                                        |
| **Предусловие**                                              | Открыта страница[trade](https://iqoption.com/traderoom), реализован вход в аккаунт. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| в правом нижнем углу нажать на кнопку таймера                | Открылось страница со всеми выполненными транзакциями        |
| по середине экрана нажимаем на календар и выбираем нужный диапазон дат "01.09.2001-11.10.2021" | на странице появились все выполненые трейды в периоде между "01.09.2001-11.10.2021" |
|                                                              |                                                              |

