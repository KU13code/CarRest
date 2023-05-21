# CarRest
___

## Описание:
Web версия.


 ## __Инструменты__

[![IntelliJ IDEA](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/intellij-idea-48.png)](https://www.jetbrains.com/idea/)
[![Java](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/java-coffee-cup-48.png)](https://www.java.com/ru/)
[![PostgreSQL](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/pgSQL.png)](https://www.postgresql.org/)
[![Spring](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/spring-48.png)](https://spring.io/)
[![XML](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/xml-48.png)](https://www.xml.com/)
[![Hibenate](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/hibernate-1.png)](https://hibernate.org/)
[![Visual studio code](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/visual-studio-code-2019-48.png)](https://code.visualstudio.com/)
<br> 


## __Установка и настойка__
### Перед запуском данного кода:
- #### Создайте базу данных и таблицы;


```postgresql
create  table cars(
        id serial not null primary key ,
        brand varchar(45),
        model varchar(45),
        engine varchar(45),
        ls integer,
        transmission varchar(45),
        owner varchar(45),
        PhoneNumber varchar(45),
        Email varchar(45)
);

insert into cars(brand, model, engine, ls, transmission, owner, PhoneNumber, Email) VALUES
                 ('BMW','X5','disel',1000,'poln-privod','Vova','82165554422','vova@mai.ru'),
                 ('KIA','RIO','patrol',150,'pered-privod','Vika','82167771133','vika@mai.ru'),
                 ('Opel','Astra','patrol',200,'pered-privod','Misha','82168886421','Misha@mai.ru');
```

- ### В application.properties укажите название, имя пользователя и пароль базы данных.
```xml
databases.url=jdbc:postgresql://localhost:5432/car_rest?useSSL=false&amp;serverTimezone=UTC
databases.username=ЛОГИН
databases.password=ПАРОЛЬ
```
