# Java-OOP-P7
1. Kelebihan Inner Class : Inner class dapat menyembunyikan detail implementasi yang tidak
diperlukan dari kelas luar, Inner Class membatasi akses dari kelas luar , Inner Class dapat
melakukan pengelompokan kelas-kelas yang saling terkait
![gambar1](https://github.com/ZIDANIDROS/Java-OOP-P7/blob/main/screenshoot/Luar.PNG)

2. Kekurangan Inner Class : Dapat terjadi kompleksitas pada code jika terlalu banyak inner class
pada suatu hierarki, jika terlalu banyak instance inner class dapat menggunakan memori yang
lebih besar. Inner class MInner digunakan di dalam metode go dari kelas MOuter untuk mencetak
beberapa variabel, termasuk m, x, y, a, dan b. Variabel y dideklarasikan sebagai final agar bisa
diakses dalam inner class. Main hanya membuat objek MOuter dan memanggil metode go
dengan argumen yang dihasilkan secara acak menggunakan Math.random
![gambar2](https://github.com/ZIDANIDROS/Java-OOP-P7/blob/main/screenshoot/MOuter.PNG)

3. MainApp nya
![gambar3](https://github.com/ZIDANIDROS/Java-OOP-P7/blob/main/screenshoot/MainApp.PNG)
