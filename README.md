# Проект по автоматизации тестирования для сайта Dom.ru уфимского филиала
## <a target="_blank" href="[https://www.ufa.dom.ru/](https://ufa.dom.ru/)">Веб сайт Dom.ru</a>

## :hotsprings: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg">
<img width="6%" title="Java" src="https://starchenkov.pro/qa-guru/img/skills/Java.svg">
<img width="6%" title="Selenide" src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg">
<img width="6%" title="Selenoid" src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg">
<img width="6%" title="Allure Report" src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg">
<img width="6%" title="Allure_EE" src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg">
<img width="6%" title="Gradle" src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg">
<img width="6%" title="JUnit5" src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg">
<img width="6%" title="GitHub" src="https://cdn.icon-icons.com/icons2/2351/PNG/128/logo_github_icon_143196.png">
<img width="6%" title="Jenkins" src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg">
<img width="6%" title="Browserstack" src="https://starchenkov.pro/qa-guru/img/skills/Browserstack.svg">
<img width="6%" title="Jira" src="https://starchenkov.pro/qa-guru/img/skills/Jira.svg">
<img width="6%" title="Appium" src="https://starchenkov.pro/qa-guru/img/skills/Appium.svg">
<img width="6%" title="REST Assured" src="https://starchenkov.pro/qa-guru/img/skills/Rest-Assured.svg">
<img width="6%" title="Docker" src="https://starchenkov.pro/qa-guru/img/skills/Docker.svg">
</p>

## :hotsprings: Проверки
- Проверка доступных комплексных предложений (тесты с PageObjects)
- Проверка Title страницы сайта
- Поиск оборудования для заказа
- Проверка возможности заказа роутеров
- Проверка возможности заказа Яндекс.Станции
- Проверка пункта "Проверка адреса подключения"

## :hotsprings: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/Nikkitox-QAGuru-DomruTests/">Сборка в Jenkins</a>
<p align="center">
<img title="src/images/screenshots/jenkins-job.png" src="src\images\screenshots\jenkins-job.png">
</p>

### Параметры сборки в Jenkins:
Сборка в Jenkins

- browser (браузер, default browser chrome)
- size (размер окна браузера, default size 1920x1080)
- threads (количество потоков)

## :hotsprings: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-Dsize=${BROWSER_SIZE}
-Dthreads=${THREADS}
```

## :hotsprings: Allure Report
- ### Главный экран Allure
<p align="center">
<img title="Allure Overview Dashboard" src="src\images\screenshots\main-page-allure-report.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="src\images\screenshots\allure-report-tests.png">
</p>

## :hotsprings: Интеграция с Allure TestOps
- ### Главный экран с запуском
<p align="center">
<img title="TestOps Launch Page" src="src\images\screenshots\testops-main.png">
</p>

- ### Страница с тестами в TestOps
<p align="center">
<img title="TestOps tests page" src="src\images\screenshots\testops-tests.png">
</p>

## :hotsprings: Интеграция с Jira
- ### Страница с задачей в Jira
<p align="center">
<img title="Jira issue" src="src\images\screenshots\jira.png">
</p>

## :hotsprings: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="src\images\screenshots\telegram.png">
</p>

## :hotsprings: Примеры прохождения тестов
- К каждому тесту в Allure Report прилагается видео. Пример ниже
<p align="center">
  <img title="Selenoid Video" src="src\images\screenshots\selenoidvideo.gif">
</p>
