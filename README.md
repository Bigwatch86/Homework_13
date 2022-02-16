[![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%231AA432&size=32&duration=2000&center=true&vCenter=true&multiline=true&width=550&height=86&lines=%D0%9F%D1%80%D0%BE%D0%B5%D0%BA%D1%82+%D0%BF%D0%BE+%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8;%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F+%D1%81%D0%B0%D0%B9%D1%82%D0%B0+citilink.ru)](https://git.io/typing-svg)


<h1>:bookmark_tabs: Содержание</h1>

:eight_spoked_asterisk:	 Стек технологий

:eight_spoked_asterisk:	 Запуск тестов в Jenkins

:eight_spoked_asterisk:	 Отчет о результатах тестирования в Allure Report

:eight_spoked_asterisk:	 Уведомления в Telegram с использованием бота

:eight_spoked_asterisk:	 Пример запуска теста в Selenoid


<h2>:books:	 Стек технологий</h2>

<p align="center">
<img src="images/logo/Allure_Report.svg" height="48" width="48"> 
<img src="images/logo/GitHub.svg" height="48" width="48">
<img src="images/logo/Gradle.svg" height="48" width="48">
<img src="images/logo/Intelij_IDEA.svg" height="48" width="48">
<img src="images/logo/JUnit5.svg" height="48" width="48">
<img src="images/logo/Selenide.svg" height="48" width="48">
<img src="images/logo/Selenoid.svg" height="48" width="48">
<img src="images/logo/Telegram.svg" height="48" width="48">
</p>

<h2>:arrow_forward:	 Запуск тестов в Jenkins</h2>

```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```
