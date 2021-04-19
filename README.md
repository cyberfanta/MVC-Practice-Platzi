# MVC-Practice-Platzi
Practice for MVC architecture [platzi.com](https://platzi.com/clases/1619-arquitectura-android/20857-mvc-en-un-proyecto-android-analizando-el-codigo-en/)

## Content
This is a practice for MVC architecture, also include the upgrade for the course material.
I decided upgrade it because the course was filmed some time ago and if you try follow the instructions, you will fail for sure.
The idea of this course is learn the architecture, not understand every code line.
So this is my contribution to improve this course.

## Demo
If you want to see the demo of this project deployed, you can visit [Demo of the project](https://appdistribution.firebase.dev/i/f91330512ca931d2)

## How to use it
If you need help to use this project, follow these steps:

### First: Clone this project to your Android Studio
* First install Android Studio from this link: [https://developer.android.com/studio](https://developer.android.com/studio)
* Go to File->New->Project from Version Control
* Select Version Control: Git
* Paste the URL of this project: https://github.com/cyberfanta/MVC-Practice-Platzi.git
* Select a target directory
* Press clone

### Second: Create you own Api Key from linkmydeals.com
* Go to our Api Rest Server: [http://myaccount.linkmydeals.com/](http://myaccount.linkmydeals.com/)
* Create you own account
* Go to Add/Remove Stores
* On select stores, change **All Stores** for **Free**
* Select the stores that you want to include
* Go to Api->Documentation
* Get your **Api Key**
* Go to the file ApiAdapter.kt
* Go to the line 9, **private val apiKey = CryptoUtils.getApiKey()**
* Change **CryptoUtils.getApiKey()** for your **Api Key**

### Third: Run the project and enjoy
* Go to Run->Run'app'

## Preview
If you did all steps described before, you will be able to see the next pictures:

![Launcher View](/docs/Picture_1.png)
![Product Detail View](/docs/Picture_2.png)

## Note
I thank my wife Solange García for all her support and understanding to achieve my learning in all matters related to computers.
I thank Professor Anahí Salgado Díaz for sharing her knowledge and every day turning her students into better professionals.
[Old code made for our teacher](https://github.com/anncode1/Curso-Arquitectura-Android)





