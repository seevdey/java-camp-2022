using System;

namespace YoutubeEgitim
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1 = sayi2;
            sayi2 = 100;

            Console.Write(sayi1);*/

            /*
            int[] sayilar1 = new [] {34, 45,2};
            int[] sayilar2 = new[] {7, 857, 10};

            sayilar1 = sayilar2;
            sayilar2[0] = 1000;
            Console.WriteLine(sayilar1[0]);*/

           
            //new lediğin anda bellekte referans tutuyor
            CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Save();

            Customer customer = new Customer(); //örneğini oluşturmak, instance oluşturmak, instance creation
            //Örnek oluşturmak demek heap te bir referans numarasını oluşturmak demek
            customer.Id = 1;
            customer.City = "İstanbul";

            CustomerManager customerManager = new CustomerManager(customer);
            customerManager.Save();
            customerManager.Delete();

            Company company = new Company();
            company.TaxNumber = "10000";
            company.CompanyName = "Arçelik";
            company.Id = 100;

            CustomerManager customerManager2 = new CustomerManager(new Company());

            Person person = new Person();
            person.FirstName = "";
            person.NationalIdentity = "11312";

            Customer c1 = new Customer();
            Customer c2 = new Person();
            Customer c3 = new Company();


            Console.ReadLine();
        }

    }

    
    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
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

        public CustomerManager(Customer customer)
        {
            _customer = customer;
        }

        //Bu metod çalıştığı zaman bana constructor dan gelmiş müşteriyi kaydediyor 
        public void Save() 
        {
            Console.WriteLine("Müşteri kaydedildi : " + _customer.FirstName);
        }

        public void Delete()
        {
            Console.WriteLine("Müşteri silindi : " + _customer.FirstName);
        }
    }

}
