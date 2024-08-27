# Final Projesi - FT Teknoloji Java Spring Boot Bootcamp

## Online Uçak ve Otobüs Bileti Satış Uygulaması
Bu proje, kullanıcıların uçak ve otobüs bileti alabileceği bir online satış platformu geliştirilmesi üzerine odaklanmıştır. Uygulama, kullanıcıların sisteme kayıt olup giriş yapabilmelerini, bilet aramalarını ve satın almalarını sağlar. Ayrıca, admin kullanıcılarının sefer ekleme, iptal etme ve satış raporlarını görüntüleyebilme yetkileri vardır.

## Proje Şeması
![Ticket_Service_Diagram](https://github.com/user-attachments/assets/ee6c8f34-a4d2-4b68-a018-199e64ca3bd3)

## Gereksinimler

### Temel Gereksinimler
- **Kullanıcı Yönetimi:** Kullanıcılar sisteme kayıt olabilir ve giriş yapabilir. Kayıt işleminden sonra kullanıcılara e-posta gönderilmelidir. Ayrıca kullanıcılara roller atanabilir ve bu roller silinebilir.
- **Bilet Arama ve Satın Alma:** Kullanıcılar şehir bilgisi, taşıt türü (uçak & otobüs) veya tarih bilgisi ile tüm seferleri arayabilir. Bireysel kullanıcılar aynı sefer için en fazla 5 bilet, kurumsal kullanıcılar ise en fazla 40 bilet alabilir.
- **Bilet Satış Kısıtlamaları:** Bireysel kullanıcılar tek bir siparişte en fazla 2 erkek yolcu için bilet alabilir.
- **Satın Alma İşlemi:** Başarılı bir satın alma işleminden sonra bilet bilgileri kullanıcının telefonuna SMS ve e-posta ile gönderilmelidir.
- **Veri Güvenliği:** Kullanıcı şifreleri SHA-512 algoritmasıyla hashlenerek kaydedilmelidir.
- **Kullanıcı Yetkileri:** Kullanıcılar sadece kendi bilgilerine ulaşabilir.

### Teknik Gereksinimler
- **Bildirim Servisi:** SMS, mail ve push notification gönderme işlemleri için sadece veritabanı kayıt işlemi yapılması yeterlidir. Bu işlemler strateji pattern ile tek bir servis üzerinden yapılmalıdır.
- **Mikroservis Mimarisi:** Uygulama microservice mimarisine uygun olarak geliştirilmelidir.
- **Performans Optimizasyonu:** Performans problemlerini önlemek amacıyla gerekli geliştirmeler eklenmelidir.
- **Asenkron İşlemler:** SMS, mail ve push notification gönderim işlemleri asenkron olmalıdır.
- **Senkron Ödeme İşlemleri:** Ödeme servisi işlemleri senkron olmalıdır.

## Sistem Kabulleri
- **Kullanıcı Tipleri:** Kullanıcılar bireysel ve kurumsal olabilir.
- **Yolcu Kapasitesi:** Uçak yolcu kapasitesi 189, otobüs yolcu kapasitesi 45'tir.
- **Ödeme Yöntemleri:** Sadece kredi kartı ve havale/EFT ile ödeme kabul edilir.

## Kullanılan Teknolojiler
- **Java 11**
- **Spring Boot**
- **JUnit 5**
- **RabbitMQ**
- **PostgreSQL / MySQL / MongoDB** (ihtiyaca göre)
- **Redis**
- **JWT Token**

## Proje Değerlendirmesi
- **Backend Doğruluğu:** Uygulama, belirtilen kurallara göre doğru çalışmalıdır. (25 Puan)
- **Unit Test Kapsamı:** Unit test oranı paket ve class bazında en az %90 olmalıdır. (15 Puan)
- **Mikroservis Mimarisine Uygunluk:** Mikroservis mimarisi ve teknolojileri doğru yansıtılmalıdır. (15 Puan)
- **Veritabanı Kullanımı:** NoSQL veya RDBMS teknolojileri doğru kullanılmalıdır. (20 Puan)
- **Loglama ve Hata Yönetimi:** Loglama ve exception handling mekanizmaları doğru kurulmalıdır. (10 Puan)
- **Dökümantasyon:** Proje için Readme, Postman Collection, Diagram, Swagger dokümantasyonları hazırlanmalıdır. (5 Puan)
- **Kod Kalitesi:** Kodun anlaşılır ve düzenli olması sağlanmalıdır (paket ve class yapısı, isimlendirmeler vb.). (10 Puan)

## Nasıl Kurulur?
1. **Projeyi klonlayın:**
   ```bash
   git clone https://github.com/bedirhanbalci/ft-teknoloji-bootcamp-final-case.git

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
### Bedirhan Balcı
<a href="https://github.com/bedirhanbalci" target="_blank">
<img  src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 20px;" />
</a>
<a href = "mailto:bedirhanbalci@outlook.com?subject = Feedback&body = Message">
<img src=https://img.shields.io/badge/send-email-email?&style=for-the-badge&logo=microsoftoutlook&color=CD5C5C alt=microsoftoutlook style="margin-bottom: 20px; margin-left:20px" />
</a>
<a href="https://www.linkedin.com/in/bedirhanbalci" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 20px; margin-left:20px" />
</a>
