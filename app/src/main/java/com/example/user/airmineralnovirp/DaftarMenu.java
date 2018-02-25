package com.example.user.airmineralnovirp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    public static ArrayList<MinumanItem> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

   //List yang akan muncul,  deskripsi dan infonya

    public ArrayList<MinumanItem> isi(){
        ArrayList<MinumanItem> data = new ArrayList<>();
        data.add(new MinumanItem("Ades","Ini adalah AMDK merk ADES","Ades adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi",R.drawable.ades));
        data.add(new MinumanItem("Amidis","Ini adalah AMDK merk AMIDIS","AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan sepanas 180 derajat celcius sehingga menghasilkan air minum yang murni",R.drawable.amidis));
        data.add(new MinumanItem("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei",R.drawable.aqua));
        data.add(new MinumanItem("Cleo","Ini adalah AMDK merk CLEAO","Clue adalah salah satu minuman mineral yang ada dijual di pasaran Indonesia",R.drawable.cleo));
        data.add(new MinumanItem("Club","Ini adalah AMDK merk CLUB","Club berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.",R.drawable.club));
        data.add(new MinumanItem("Equil","Ini adalah AMDK merk EQUIL","Dalam sejarah perusahaan, Equil pertama kali diproduksi (dibotolkan) pada tahun 1998 di Villa D'Equilibrium, Kabupaten Sukabumi, Provinsi Jawa Barat.",R.drawable.equil));
        data.add(new MinumanItem("Evian","Ini adalah AMDK merk EVIAN","Evian adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.",R.drawable.evian));
        data.add(new MinumanItem("Le Minerale","Ini adalah AMDK merk LE MINERALE","Le Minerale diproduksi oleh PT Tirta Frisindo Jaya yang tak lain adalah anak usaha Grup Mayora. Le Minerale ini merupakan salah satu produk yang paling bontot dimiliki Mayora.",R.drawable.leminerale));
        data.add(new MinumanItem("Nestle","Ini adalah AMDK merk NESTLE","Nestlé Indonesia adalah anak perusahaan Nestlé S.A., produsen makanan dan minuman terbesar di dunia yang berkantor pusat di Vevey, Swiss dan telah beroperasi selama 150 tahun.",R.drawable.nestle));
        data.add(new MinumanItem("Pristine","Ini adalah AMDK merk PRISTINE","Super Wahana Tehno telah memproduksi dan meluncurkan produk baru yaitu : air mineral ionisasi,untuk yang pertama kali dan satu-satunya di Indonesia dengan merk PRISTINE.",R.drawable.pristine));
        data.add(new MinumanItem("Vit","Ini adalah AMDK merk VIT"," VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia",R.drawable.vit));
        return data;
    }
}
