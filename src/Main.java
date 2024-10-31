//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),
        new OgrenciKrediManager(),new TarımKrediManager()};
        // Bütün kredi hesaplamaları için aynı oranı kullandık.
        // Diyelim ki ogrenci kredi oranı daha az olucak.
        // class'ın içinde fonksiyon oluşturabilir ve döndüreceği değeri değiştirebiliriz.
        // Ama bu sefer BaseKrediManager altında bir dizi olarak alamayız.
        // Bunu overriding ile yapıyoruz.
        // Aynı fonksiyonu OgrenciKrediManager class ının içine yazdırırsak halletmiş oluyoruz.
        // Siz o class içerisinde bi aksini belli etmedikçe overridiable(üstüne yazılabilir).
        // Eğer siz extends edilen class ın (ana bileşenlerin olduğu class) işlem yerine final
        // keyword ü eklerseniz bunu kıramaz ve üstüne yazamaz.

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }

    }
}