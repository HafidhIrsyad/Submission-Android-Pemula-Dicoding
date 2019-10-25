package com.example.sahambluechips

object StockData {
    private val stockNames = arrayOf(
        "Astra International",
        "Bank Negara Indonesia",
        "Indofood",
        "Bank Mandiri",
        "Perusahaan Gas Negara",
        "Pokphand",
        "Semen Indonesia",
        "Telkom Indonesia",
        "Unilever",
        "Waskita")

    private val stockDetails = arrayOf(
        "PT Astra International Tbk didirikan di Jakarta pada tahun 1957 sebagai sebuah perusahaan perdagangan umum dengan nama Astra International Inc. Pada tahun 1990, telah dilakukan perubahan nama menjadi PT Astra International Tbk, dalam rangka penawaran umum perdana saham Perseroan kepada masyarakat, yang dilanjutkan dengan pencatatan saham Perseroan di Bursa Efek Indonesia dengan menggunakan ticker ASII. Nilai kapitalisasi pasar Astra pada akhir tahun 2018 adalah sebesar Rp333,0 triliun.PT Astra International Tbk didirikan di Jakarta pada tahun 1957 sebagai sebuah perusahaan perdagangan umum dengan nama Astra International Inc. Pada tahun 1990, telah dilakukan perubahan nama menjadi PT Astra International Tbk, dalam rangka penawaran umum perdana saham Perseroan kepada masyarakat, yang dilanjutkan dengan pencatatan saham Perseroan di Bursa Efek Indonesia dengan menggunakan ticker ASII. Nilai kapitalisasi pasar Astra pada akhir tahun 2018 adalah sebesar Rp333,0 triliun.",
        "PT. Bank Negara Indonesia (Persero), Tbk (selanjutnya disebut “BNI” atau “Bank”) pada awalnya didirikan di Indonesia sebagai Bank sentral dengan nama “Bank Negara Indonesia” berdasarkan Peraturan Pemerintah Pengganti Undang-Undang No. 2 tahun 1946 tanggal 5 Juli 1946. Selanjutnya, berdasarkan Undang-Undang No. 17 tahun 1968, BNI ditetapkan menjadi “Bank Negara Indonesia 1946”, dan statusnya menjadi Bank Umum Milik Negara. Selanjutnya, peran BNI sebagai Bank yang diberi mandat untuk memperbaiki ekonomi rakyat dan berpartisipasi dalam pembangunan nasional dikukuhkan oleh UU No. 17 tahun 1968 tentang Bank Negara Indonesia 1946.",
        "indofood secara progresif berubah menjadi perusahaan solusi makanan Total dengan operasi di semua tahap produksi makanan. Selama dua dasawarsa terakhir, Indofood telah berubah menjadi perusahaan solusi makanan Total dengan operasi di semua tahap manufaktur makanan, dari produksi bahan baku dan pengolahan mereka, hingga produk konsumen di pasaran. Hari ini, dikenal sebagai perusahaan yang mapan dan pemain terkemuka di setiap kategori bisnis di mana ia beroperasi. Dalam operasi bisnisnya, Indofood memanfaatkan skala ekonomi dan model bisnis tangguh dengan empat grup bisnis strategis yang saling melengkapi (grup)",
        "Bank Mandiri didirikan pada 2 Oktober 1998, sebagai bagian dari program restrukturisasi perbankan yang dilaksanakan oleh pemerintah Indonesia. Pada bulan Juli 1999, empat bank pemerintah -- yaitu Bank Bumi Daya, Bank Dagang Negara, Bank Ekspor Impor Indonesia dan Bank Pembangunan Indonesia -- dilebur menjadi Bank Mandiri, dimana masing-masing bank tersebut memiliki peran yang tak terpisahkan dalam pembangunan perekonomian Indonesia. Sampai dengan hari ini, Bank Mandiri meneruskan tradisi selama lebih dari 140 tahun memberikan kontribusi dalam dunia perbankan dan perekonomian Indonesia.",
        "Perusahaan Gas Negara (PGN) adalah perusahaan nasional Indonesia terbesar di bidang transportasi dan distribusi gas bumi yang berperan besar dalam pemenuhan gas bumi domestik. Kami telah bertransformasi menjadi perusahaan yang berdedikasi pada satu tujuan yaitu Memberikan keahliannya, energi dan infrastruktur yang diperlukan untuk mendorong pertumbuhan ekonomi Indonesia secara jangka panjang. PGN secara berkesinabungan mengintegrasikan rantai bisnis gas bumi dari hulu sampai hilir demi melayani masyarakat.",
        "PT Charoen Pokphand Indonesia Tbk (”Perseroan”) didirikan di Indonesia dengan nama PT Charoen Pokphand Indonesia Animal Feedmill Co. Limited, berdasarkan akta pendirian yang dimuat dalam Akta No. 6 tanggal 7 Januari 1972, yang dibuat dihadapan Drs. Gde Ngurah Rai, SH, Notaris di Jakarta, sebagaimana telah diubah dengan Akta No. 5 tanggal 7 Mei 1973 yang dibuat dihadapan Notaris yang sama. Akta pendirian tersebut telah disahkan oleh Menteri Kehakiman Republik Indonesia dengan Surat Keputusan No. YA-5/197/21 tanggal 8 Juni 1973 dan telah didaftarkan pada Kepaniteraan Pengadilan Negeri Jakarta Pusat di bawah No. 2289 tanggal 26 Juni 1973, serta telah diumumkan dalam Berita Negara No. 65 tanggal 14 Agustus 1973, Tambahan No. 573. Anggaran Dasar Perseroan tersebut telah diubah, terakhir dengan Akta Notaris Fathiah Helmi, SH No. 94 tanggal 19 Juni 2015. Akta tersebut telah diterima dan dicatat oleh Kementerian Hukum dan Hak Asasi Manusia Republik Indonesia dalam Surat No. AHU-AH.01.03-0949604 tanggal 8 Juli 2015.",
        "PT Semen Indonesia (Persero) Tbk (“SMGR”) didirikan pada tahun 1957 di Gresik, dengan nama NV Semen Gresik. Pada tahun 1991, PT Semen Gresik merupakan perusahaan BUMN pertama yang go public di Bursa Efek Indonesia. Selanjutnya, pada tahun 1995, PT Semen Gresik (Persero) Tbk melakukan konsolidasi dengan PT Semen Padang dan PT Semen Tonasa yang kemudian dikenal dengan nama Semen Gresik Group. Dalam perkembangannya pada tanggal 7 Januari 2013, PT Semen Gresik (Persero) Tbk bertransformasi menjadi PT Semen Indonesia (Persero) Tbk, dan berperan sebagai strategic holding company yang menaungi PT Semen Gresik, PT Semen Padang, PT Semen Tonasa, dan Thang Long Cement Company. Pada tanggal 31 Januari 2019, PT Semen Indonesia (Persero) Tbk melalui anak usahanya PT Semen Indonesia Industri Bangunan (SIIB) telah resmi mengakuisisi 80,6% kepemilikan saham Holderfin B.V. yang ditempatkan dan disetor di PT Holcim Indonesia Tbk. Selanjutnya pada tanggal 11 Februari 2019, melalui mekanisme Rapat Umum Pemegang Saham Luar Biasa, telah disahkan perubahan nama PT Holcim Indonesia Tbk  menjadi PT Solusi Bangun Indonesia Tbk. Dengan prinsip “Membangun Kekuatan Memajukan Indonesia“ Semen Indonesia terus meningkatkan sinergi dan inovasi demi mencapai keunggulan kualitas, menjaga keterpaduan dan kesinambungan kinerja ekonomi, berkomitmen terhadap lingkungan serta memberikan manfaat sosial dalam seluruh kegiatan operasional.",
        "PT Telkom Indonesia (Persero) Tbk (Telkom) adalah Badan Usaha Milik Negara (BUMN) yang bergerak di bidang jasa layanan teknologi informasi dan komunikasi (TIK) dan jaringan telekomunikasi di Indonesia. Pemegang saham mayoritas Telkom adalah Pemerintah Republik Indonesia sebesar 52.09%, sedangkan 47.91% sisanya dikuasai oleh publik. Saham Telkom diperdagangkan di Bursa Efek Indonesia (BEI) dengan kode “TLKM” dan New York Stock Exchange (NYSE) dengan kode “TLK”. Dalam upaya bertransformasi menjadi digital telecommunication company, TelkomGroup mengimplementasikan strategi bisnis dan operasional perusahaan yang berorientasi kepada pelanggan (customer-oriented). Transformasi tersebut akan membuat organisasi TelkomGroup menjadi lebih lean (ramping) dan agile (lincah) dalam beradaptasi dengan perubahan industri telekomunikasi yang berlangsung sangat cepat. Organisasi yang baru juga diharapkan dapat meningkatkan efisiensi dan efektivitas dalam menciptakan customer experience yang berkualitas.",
        "Sejak didirikan pada tanggal 5 Desember 1933, Unilever Indonesia telah tumbuh menjadi salah satu perusahaan Fast Moving Consumer Goods (FMCG) terkemuka di Indonesia. Kami telah menemani masyarakat Indonesia melalui produk dari berbagai kategori, seperti Pepsodent, Lux, Lifebuoy, Dove, Sunsilk, Clear, Rexona, Vaseline, Rinso, Molto, Sunlight, Wall’s, Royco, Bango, dan masih banyak lagi.",
        "PT Waskita Karya adalah Badan Usaha Milik Negara Indonesia yang bergerak di bidang konstruksi. Perusahaan ini berasal dari nasionalisasi perusahaan Belanda Volker Aannemings Maatschappij N.V. pada tahun 1961 dan berubah bentuk menjadi persero pada tahun 1973.")

    private val stockImages = intArrayOf(
        R.drawable.astra_international,
        R.drawable.bni,
        R.drawable.indofood,
        R.drawable.mandiri,
        R.drawable.pgn,
        R.drawable.pokphand,
        R.drawable.semen_indonesia,
        R.drawable.telkom,
        R.drawable.unilever,
        R.drawable.waskita)

    val listData: ArrayList<Stock>
        get() {
            val list = arrayListOf<Stock>()
            for (position in stockNames.indices) {
                val stock = Stock()
                stock.name = stockNames[position]
                stock.detail = stockDetails[position]
                stock.photo = stockImages[position]
                list.add(stock)
            }
            return list
        }
}