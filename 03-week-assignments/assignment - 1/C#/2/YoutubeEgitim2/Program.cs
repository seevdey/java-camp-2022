using System;

namespace YoutubeEgitim2
{
    class Program
    {
        static void Main(string[] args)
        {
            //IoC Container
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager() );
            CustomerManager customerManager2 = new CustomerManager(new Customer(), new TeacherCreditManager());

            customerManager.GiveCredit();
            customerManager2.GiveCredit();

            CustomerManager customerManager3 = new CustomerManager(new Customer(), new TeacherCreditManager());
            customerManager3.GiveCredit();

            Console.ReadLine();

        }
    }

    class CreditManager
    {
        public void Calculate(int creditType)
        {
            /*
            //sonar qube
            if (creditType == 1) //esnaf
            {

            }
            if (creditType == 2) //ogretmen
            {

            */ 

            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
    }

    //Interface ler referans tiptir. Referans olduğu için kim ICreditManager ı implement ederse class ının referansını tutabilir
    //Interface in amacı bağımlılıkları engellemek, if lerden kurtulmak
    interface ICreditManager 
    {
        //interface için metodun ismini ve varsa parametrelerini yaz
        void Calculate();
        void Save();
    }

    /*
    abstract class lar bizim için ortak class ları tutar. Tamamlanmış veya tamamlanmamış şekilde metod yazabilirsiniz
    abstract class lar; class özelliği gösterir. O yüzden bir sınıf sadece bir  abstract sınıfı inherit edebilir
    Bir sınıf sadece bir abstract class ı veya başka bir class ı inherit edebilir. Yani hem class ı hem abstract class ı inherit edemez
    abstract class larda, interface lerde asla new lenemez. İkisi de referans tiplerin özelliklerinden yararlanır. Dolayısıyla yazılımdaki değişimi kontrol etmek için kullanılan yöntemlerdir
    */

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate(); //Ortak değil her yerde değişken bir metod //Tamamlanmamış metod

        /*
        public void Save() //Tamamlanmış metod
        {
            Console.WriteLine("Kaydedildi");
        }*/

        //Örneğin Öğretmen Kredi sini  verirken başka bir işlem daha yapmak istersek
        public virtual void Save() //Tamamlanmış metod
        {
            Console.WriteLine("Kaydedildi");
        }
    }


    //Bir sınıf birden fazla interface i implement edebilir
    class TeacherCreditManager : BaseCreditManager, ICreditManager
    //TeacherCreditManager class ı, ICreditManager interface inin operasyonlarını doldurmak zorundadır
    {
        public override void Calculate()
        {
            //hesaplamalar
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        }

        /*
        public void Save()
        {
            Console.WriteLine("Kaydedildi");
        }*/

        public override void Save()
        {
            //
            base.Save();
            //
        }
    }

    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate() //override --> üstüne yaz
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }

        /*
        //DRY --> kendini tekrarlama!
        public void Save()
        {
            Console.WriteLine("Kaydedildi");
        }*/
    }

    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Araba kredisi hesaplandı");
        }

        /*
        public void Save()
        {
            Console.WriteLine("Kaydedildi");
        }*/
    }

    //SOLID --> yazılım geliştirme prensibi
    class Customer
    {
        //Nesne oluşturulduğu zaman 1 kere çalışacak
        public Customer()//Müşteri nesnesini başlatacak kod
        {
            Console.WriteLine("Müşteri nesnesi başlatıldı");
        }

        public int Id { get; set; } //Id yi hem yazabilir hem okuyabilirsiniz
        public string City { get; set; }

        /*class a hem özellik hem metod koyulmamalı! yazılıma aykırı bir durumdur <-- SOLID
         * Yani 1 class sadece 1 işi yapabilir
        public void Save()
        {
            Console.WriteLine("Müşteri kaydedildi ");
        }*/
    }

    //Bir sınıf sadece bir sınıfı inherit edebilir
    class Person : Customer //Kendi özellikleri vardır ancak temel olarak Customer sınıfını da içerir  
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }

    class Company : Customer //Java'da extends //Şirket müşteri nesnesinden inherit olur
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    //Katmanlı Mimariler 
    //Görevleri birbirinden kesinlikle ayırıyoruz
    class CustomerManager //Bu kullanım doğru
    {
        private Customer _customer;
        private ICreditManager _creditManager;

        public CustomerManager(Customer customer, ICreditManager creditManager) //Customer customer, ICreditManager creditManager --> Polimorfizm
        {
            _customer = customer;
            _creditManager = creditManager;
        }

        //Bu metod çalıştığı zaman bana constructor dan gelmiş müşteriyi kaydediyor 
        public void Save()
        {
            Console.WriteLine("Müşteri kaydedildi : ");
        }

        public void Delete()
        {
            Console.WriteLine("Müşteri silindi : ");
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }
    }
}
