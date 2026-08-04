package com.example.e_commercelaptop.data.local

import com.example.e_commercelaptop.R

object ProductRepository {
    val initialProducts = listOf(
        // ==========================================
        // 1. DELL (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "Dell XPS 9345",
            brand = "DELL",
            price = "26.990.000₫",
            description = "Snapdragon X Elite, RAM 16GB, SSD 512GB, Qualcomm Adreno, 13.4 FHD+",
            imageResId = R.drawable.dell_2
        ),
        ProductEntity(
            name = "Dell Inspiron 15 3530",
            brand = "DELL",
            price = "18.000.000₫",
            description = "Core i5 1334U, RAM 16GB, SSD 512GB, Full HD 120Hz, OfficeH24+365, Win11",
            imageResId = R.drawable.dell_1
        ),
        ProductEntity(
            name = "Dell XPS 13 9315",
            brand = "DELL",
            price = "22.500.000₫",
            description = "Core i5-1230U, RAM 8GB, SSD 512GB, 13.4 inch FHD+, Intel Iris Xe, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell XPS 13 Plus 9320",
            brand = "DELL",
            price = "32.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 512GB, 13.4 inch 3.5K OLED Touch, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell XPS 14 9440",
            brand = "DELL",
            price = "45.990.000₫",
            description = "Ultra 7 155H, RAM 16GB, SSD 1TB, RTX 4050 6GB, 14.5 inch 3.2K OLED 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell XPS 16 9640",
            brand = "DELL",
            price = "62.490.000₫",
            description = "Ultra 9 185H, RAM 32GB, SSD 1TB, RTX 4070 8GB, 16.3 inch 4K+ OLED 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Inspiron 14 5430",
            brand = "DELL",
            price = "16.490.000₫",
            description = "Core i5-1335U, RAM 16GB, SSD 512GB, 14.0 inch FHD+ 2.5K, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Inspiron 16 5630",
            brand = "DELL",
            price = "20.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 512GB, 16.0 inch FHD+ Touch, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Inspiron 14 7430 2-in-1",
            brand = "DELL",
            price = "19.500.000₫",
            description = "Core i5-1335U, RAM 16GB, SSD 512GB, 14.0 inch FHD+ Cảm ứng gập 360",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Vostro 3430",
            brand = "DELL",
            price = "12.890.000₫",
            description = "Core i3-1305U, RAM 8GB, SSD 256GB, 14.0 inch FHD, Intel UHD, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Vostro 5630",
            brand = "DELL",
            price = "21.490.000₫",
            description = "Core i7-1355U, RAM 16GB, SSD 512GB, 16.0 inch FHD+, Intel Iris Xe",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Gaming G15 5530",
            brand = "DELL",
            price = "24.990.000₫",
            description = "Core i5-13450HX, RAM 16GB, SSD 512GB, RTX 3050 6GB, 15.6 inch FHD 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Gaming G16 7630",
            brand = "DELL",
            price = "38.990.000₫",
            description = "Core i9-13900HX, RAM 32GB, SSD 1TB, RTX 4070 8GB, 16.0 inch QHD+ 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Latitude 3540",
            brand = "DELL",
            price = "17.200.000₫",
            description = "Core i5-1335U, RAM 8GB, SSD 256GB, 15.6 inch FHD, Win11 Pro",
            imageResId = 0
        ),
        ProductEntity(
            name = "Dell Precision 3480",
            brand = "DELL",
            price = "31.500.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 512GB, Nvidia RTX A500 4GB, 14.0 inch FHD",
            imageResId = 0
        ),

        // ==========================================
        // 2. HP (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "HP Spectre X360 14",
            brand = "HP",
            price = "26.900.000₫",
            description = "Core i7 1355U, RAM 16GB, SSD 512GB, 13.5 inch FHD+ Touch, Win11",
            imageResId = R.drawable.hp_2
        ),
        ProductEntity(
            name = "HP Pavilion 15",
            brand = "HP",
            price = "12.290.000₫",
            description = "Core i3 1315U, RAM 8GB, SSD 256GB, 15.6 inch FHD, Win11",
            imageResId = R.drawable.hp_1
        ),
        ProductEntity(
            name = "HP Pavilion 14",
            brand = "HP",
            price = "13.990.000₫",
            description = "Core i5-1335U, RAM 16GB, SSD 512GB, 14.0 inch FHD IPS, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Pavilion Plus 14",
            brand = "HP",
            price = "21.990.000₫",
            description = "Core i7-13700H, RAM 16GB, SSD 1TB, 14.0 inch 2.8K OLED 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Envy 13 x360",
            brand = "HP",
            price = "19.890.000₫",
            description = "Core i5-1230U, RAM 16GB, SSD 512GB, 13.3 inch FHD Touch, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Envy 16 2023",
            brand = "HP",
            price = "39.990.000₫",
            description = "Core i7-13700H, RAM 16GB, SSD 1TB, RTX 4060 8GB, 16.0 inch WQXGA 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Spectre x360 16 AI",
            brand = "HP",
            price = "48.990.000₫",
            description = "Ultra 7 155H, RAM 32GB, SSD 2TB, RTX 4050 6GB, 16.0 inch 2.8K OLED Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Victus 15 2023",
            brand = "HP",
            price = "17.990.000₫",
            description = "Core i5-12450H, RAM 16GB, SSD 512GB, RTX 2050 4GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Victus 16 2024",
            brand = "HP",
            price = "27.490.000₫",
            description = "Ryzen 7 7840HS, RAM 16GB, SSD 512GB, RTX 4060 8GB, 16.1 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Omen 16 2023",
            brand = "HP",
            price = "36.990.000₫",
            description = "Core i7-13700HX, RAM 16GB, SSD 1TB, RTX 4070 8GB, 16.1 inch QHD 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP Omen Transcend 14 AI",
            brand = "HP",
            price = "42.990.000₫",
            description = "Ultra 7 155H, RAM 16GB, SSD 1TB, RTX 4060 8GB, 14.0 inch 2.8K OLED 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP ProBook 440 G10",
            brand = "HP",
            price = "16.800.000₫",
            description = "Core i5-1335U, RAM 8GB, SSD 512GB, 14.0 inch FHD, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP ProBook 450 G10",
            brand = "HP",
            price = "20.500.000₫",
            description = "Core i7-1355U, RAM 16GB, SSD 512GB, 15.6 inch FHD, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP EliteBook 840 G10",
            brand = "HP",
            price = "29.990.000₫",
            description = "Core i5-1340P, RAM 16GB, SSD 512GB, 14.0 inch WUXGA IPS 400 nits",
            imageResId = 0
        ),
        ProductEntity(
            name = "HP 15s-fq5229TU",
            brand = "HP",
            price = "9.990.000₫",
            description = "Core i3-1215U, RAM 8GB, SSD 512GB, 15.6 inch FHD, Intel UHD, Win11",
            imageResId = 0
        ),

        // ==========================================
        // 3. ACER (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "Acer Swift X 14 AI",
            brand = "ACER",
            price = "51.680.000₫",
            description = "Core Ultra 7 processor 155H, RAM 32GB, SSD 1TB, 14.5 inch 2.8K OLED 120Hz, Win11",
            imageResId = R.drawable.acer_1
        ),
        ProductEntity(
            name = "Acer Aspire 5",
            brand = "ACER",
            price = "19.990.000₫",
            description = "i7-13620H, RAM 16GB, SSD 512GB, 15.6 inch FHD, Win11",
            imageResId = R.drawable.acer_2
        ),
        ProductEntity(
            name = "Acer Aspire 3 A315",
            brand = "ACER",
            price = "8.490.000₫",
            description = "Core i3-N305, RAM 8GB, SSD 256GB, 15.6 inch FHD, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Aspire Lite 14",
            brand = "ACER",
            price = "9.990.000₫",
            description = "Core i3-1215U, RAM 8GB, SSD 512GB, 14.0 inch WUXGA 16:10",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Swift Go 14 OLED",
            brand = "ACER",
            price = "22.990.000₫",
            description = "Core i5-13500H, RAM 16GB, SSD 512GB, 14.0 inch 2.8K OLED 90Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Swift 3 SF314",
            brand = "ACER",
            price = "15.990.000₫",
            description = "Core i5-1240P, RAM 16GB, SSD 512GB, 14.0 inch QHD IPS, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Nitro V 15 2023",
            brand = "ACER",
            price = "18.490.000₫",
            description = "Core i5-13420H, RAM 16GB, SSD 512GB, RTX 2050 4GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Nitro 5 Tiger 2022",
            brand = "ACER",
            price = "19.990.000₫",
            description = "Core i5-12500H, RAM 16GB, SSD 512GB, RTX 3050Ti 4GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Nitro 16 Phoenix",
            brand = "ACER",
            price = "28.990.000₫",
            description = "Ryzen 7 7840HS, RAM 16GB, SSD 512GB, RTX 4060 8GB, 16.0 inch WQXGA 165Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Predator Helios Neo 16",
            brand = "ACER",
            price = "35.990.000₫",
            description = "Core i7-13700HX, RAM 16GB, SSD 1TB, RTX 4060 8GB, 16.0 inch WQXGA 165Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Predator Helios 18",
            brand = "ACER",
            price = "79.990.000₫",
            description = "Core i9-14900HX, RAM 32GB, SSD 2TB, RTX 4080 12GB, 18.0 inch WQXGA Mini LED 250Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Predator Triton 17 X",
            brand = "ACER",
            price = "92.000.000₫",
            description = "Core i9-13900HJ, RAM 64GB, SSD 2TB, RTX 4090 16GB, 17.0 inch 250Hz Mini LED",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer TravelMate P2",
            brand = "ACER",
            price = "13.500.000₫",
            description = "Core i5-1235U, RAM 8GB, SSD 512GB, 14.0 inch FHD, Win11 Pro",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Enduro Urban N3",
            brand = "ACER",
            price = "14.800.000₫",
            description = "Core i5-1135G7, RAM 8GB, SSD 512GB, Chống va đập IP53, 14.0 inch FHD",
            imageResId = 0
        ),
        ProductEntity(
            name = "Acer Chromebox CXI5",
            brand = "ACER",
            price = "11.000.000₫",
            description = "Core i5-1240P, RAM 8GB, SSD 256GB, Chrome OS Chuyên Văn Phòng",
            imageResId = 0
        ),

        // ==========================================
        // 4. MACBOOK (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "Macbook Air M3",
            brand = "MACBOOK",
            price = "23.990.000₫",
            description = "Apple M3, RAM 16GB, SSD 512GB, 13 inch",
            imageResId = R.drawable.mac_1
        ),
        ProductEntity(
            name = "MacBook Pro 2024",
            brand = "MACBOOK",
            price = "59.690.000₫",
            description = "Apple M4 Pro, RAM 24GB, SSD 512GB, 14 inch",
            imageResId = R.drawable.mac_2
        ),
        ProductEntity(
            name = "MacBook Air M1 2020",
            brand = "MACBOOK",
            price = "18.290.000₫",
            description = "Apple M1 8-core CPU, 7-core GPU, RAM 8GB, SSD 256GB, 13.3 inch Retina",
            imageResId = 0
        ),
        ProductEntity(
            name = "Macbook Air M2 13 inch",
            brand = "MACBOOK",
            price = "24.500.000₫",
            description = "Apple M2 8-core CPU, 8-core GPU, RAM 8GB, SSD 256GB, 13.6 inch Liquid Retina",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Air M2 15 inch",
            brand = "MACBOOK",
            price = "28.990.000₫",
            description = "Apple M2 8-core CPU, 10-core GPU, RAM 8GB, SSD 256GB, 15.3 inch Liquid Retina",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Air M3 15 inch",
            brand = "MACBOOK",
            price = "32.890.000₫",
            description = "Apple M3 8-core CPU, 10-core GPU, RAM 16GB, SSD 512GB, 15.3 inch Liquid Retina",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 13 M2",
            brand = "MACBOOK",
            price = "27.990.000₫",
            description = "Apple M2 8-core CPU, 10-core GPU, RAM 8GB, SSD 512GB, Touch Bar",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 14 M3 Base",
            brand = "MACBOOK",
            price = "39.990.000₫",
            description = "Apple M3 8-core CPU, 10-core GPU, RAM 8GB, SSD 512GB, 14.2 inch Liquid Retina XDR",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 14 M3 Pro",
            brand = "MACBOOK",
            price = "48.990.000₫",
            description = "Apple M3 Pro 11-core CPU, 14-core GPU, RAM 18GB, SSD 512GB, Space Black",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 14 M3 Max",
            brand = "MACBOOK",
            price = "79.990.000₫",
            description = "Apple M3 Max 14-core CPU, 30-core GPU, RAM 36GB, SSD 1TB, Liquid Retina XDR",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 16 M3 Pro",
            brand = "MACBOOK",
            price = "59.990.000₫",
            description = "Apple M3 Pro 12-core CPU, 18-core GPU, RAM 18GB, SSD 512GB, 16.2 inch XDR",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 16 M3 Max",
            brand = "MACBOOK",
            price = "89.990.000₫",
            description = "Apple M3 Max 16-core CPU, 40-core GPU, RAM 48GB, SSD 1TB, 16.2 inch Liquid Retina XDR",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 14 M2 Pro Refurbished",
            brand = "MACBOOK",
            price = "36.500.000₫",
            description = "Apple M2 Pro 10-core CPU, 16-core GPU, RAM 16GB, SSD 512GB, Space Gray",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Pro 16 M2 Max",
            brand = "MACBOOK",
            price = "68.900.000₫",
            description = "Apple M2 Max 12-core CPU, 38-core GPU, RAM 32GB, SSD 1TB, Liquid Retina XDR",
            imageResId = 0
        ),
        ProductEntity(
            name = "MacBook Air M1 RAM 16GB",
            brand = "MACBOOK",
            price = "21.990.000₫",
            description = "Apple M1 8-core CPU, RAM 16GB, SSD 256GB, 13.3 inch Retina Display",
            imageResId = 0
        ),

        // ==========================================
        // 5. ASUS (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "ASUS Vivobook 15",
            brand = "ASUS",
            price = "14.290.000đ",
            description = "i7-13620H, RAM 16GB, SSD 512GB, 15.6 inch FHD OLED, Win11",
            imageResId = R.drawable.asus_1
        ),
        ProductEntity(
            name = "ASUS ROG Zephyrus",
            brand = "ASUS",
            price = "87.990.000đ",
            description = "U9-386H, RAM 32GB, SSD 1TB, 16.0 inch 2.5K OLED, Win11",
            imageResId = R.drawable.asus_2
        ),
        ProductEntity(
            name = "ASUS Vivobook Go 14",
            brand = "ASUS",
            price = "8.990.000₫",
            description = "Ryzen 3 7320U, RAM 8GB, SSD 256GB, 14.0 inch Full HD, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS Vivobook 14 OLED",
            brand = "ASUS",
            price = "17.490.000₫",
            description = "Core i5-13500H, RAM 16GB, SSD 512GB, 14.0 inch 2.8K OLED 90Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS Vivobook Pro 15 OLED",
            brand = "ASUS",
            price = "25.990.000₫",
            description = "Ryzen 7 7840HS, RAM 16GB, SSD 512GB, RTX 4050 6GB, 15.6 inch 2.8K OLED",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS Zenbook 14 OLED 2024",
            brand = "ASUS",
            price = "28.990.000₫",
            description = "Ultra 7 155H, RAM 32GB, SSD 1TB, 14.0 inch 3K OLED 120Hz Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS Zenbook DUO 2024",
            brand = "ASUS",
            price = "49.990.000₫",
            description = "Ultra 9 185H, RAM 32GB, SSD 1TB, 2 màn hình 14.0 inch 3K OLED 120Hz Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS TUF Gaming A15",
            brand = "ASUS",
            price = "18.990.000₫",
            description = "Ryzen 5 7535HS, RAM 16GB, SSD 512GB, RTX 3050 4GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS TUF Gaming F15",
            brand = "ASUS",
            price = "23.490.000₫",
            description = "Core i7-13620H, RAM 16GB, SSD 512GB, RTX 4050 6GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS ROG Strix G16 2023",
            brand = "ASUS",
            price = "39.990.000₫",
            description = "Core i7-13650HX, RAM 16GB, SSD 1TB, RTX 4060 8GB, 16.0 inch FHD+ 165Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS ROG Strix SCAR 16",
            brand = "ASUS",
            price = "75.990.000₫",
            description = "Core i9-14900HX, RAM 32GB, SSD 2TB, RTX 4080 12GB, 16.0 inch QHD+ Mini LED 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS ROG Zephyrus G14 2024",
            brand = "ASUS",
            price = "54.990.000₫",
            description = "Ryzen 9 8945HS, RAM 32GB, SSD 1TB, RTX 4070 8GB, 14.0 inch 3K OLED 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS ROG Flow Z13",
            brand = "ASUS",
            price = "42.990.000₫",
            description = "Core i9-13900H, RAM 16GB, SSD 1TB, RTX 4050 6GB, 13.4 inch QHD+ Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS ExpertBook B1 B1400",
            brand = "ASUS",
            price = "11.200.000₫",
            description = "Core i3-1215U, RAM 8GB, SSD 256GB, 14.0 inch FHD, Win11 Pro",
            imageResId = 0
        ),
        ProductEntity(
            name = "ASUS ExpertBook B5 Flip",
            brand = "ASUS",
            price = "27.500.000₫",
            description = "Core i7-1355U, RAM 16GB, SSD 512GB, 14.0 inch FHD Touch 360 độ",
            imageResId = 0
        ),

        // ==========================================
        // 6. MSI (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "Laptop MSI Modern 15",
            brand = "MSI",
            price = "11.490.000đ",
            description = "R7-7730U, RAM 16GB, SSD 512GB, 15.6 inch FHD, Win11",
            imageResId = R.drawable.msi_1
        ),
        ProductEntity(
            name = "Laptop MSI Gaming Titan 18 HX AI",
            brand = "MSI",
            price = "165.990.000đ",
            description = "U9 285HX, RAM 64GB, SSD 6TB, 18 inch UHD+, Win 11",
            imageResId = R.drawable.msi_2
        ),
        ProductEntity(
            name = "Laptop MSI Modern 14",
            brand = "MSI",
            price = "9.990.000₫",
            description = "Core i3-1215U, RAM 8GB, SSD 512GB, 14.0 inch FHD IPS, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Prestige 13 AI Evo",
            brand = "MSI",
            price = "28.990.000₫",
            description = "Ultra 7 155H, RAM 32GB, SSD 1TB, 13.3 inch 2.8K OLED Siêu Nhẹ 990g",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Prestige 16 AI Studio",
            brand = "MSI",
            price = "42.990.000₫",
            description = "Ultra 9 185H, RAM 32GB, SSD 1TB, RTX 4060 8GB, 16.0 inch UHD+ OLED",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Summit E14 Flip",
            brand = "MSI",
            price = "31.500.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 1TB, 14.0 inch QHD+ Touch Gập 360",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Thin GF63 12VE",
            brand = "MSI",
            price = "17.990.000₫",
            description = "Core i5-12450H, RAM 16GB, SSD 512GB, RTX 4050 6GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Cyborg 15 A12VF",
            brand = "MSI",
            price = "21.990.000₫",
            description = "Core i7-12650H, RAM 16GB, SSD 512GB, RTX 4060 8GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Katana 15 B13VGK",
            brand = "MSI",
            price = "29.990.000₫",
            description = "Core i7-13620H, RAM 16GB, SSD 1TB, RTX 4070 8GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Pulse 16 AI C1V",
            brand = "MSI",
            price = "35.990.000₫",
            description = "Ultra 7 155H, RAM 16GB, SSD 1TB, RTX 4060 8GB, 16.0 inch QHD+ 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Crosshair 16 HX",
            brand = "MSI",
            price = "39.990.000₫",
            description = "Core i7-14700HX, RAM 16GB, SSD 1TB, RTX 4070 8GB, 16.0 inch QHD+ 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Vector GP68 HX",
            brand = "MSI",
            price = "48.990.000₫",
            description = "Core i9-13950HX, RAM 32GB, SSD 1TB, RTX 4080 12GB, 16.0 inch FHD+ 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Stealth 16 Mercedes-AMG",
            brand = "MSI",
            price = "72.990.000₫",
            description = "Core i9-13900H, RAM 32GB, SSD 2TB, RTX 4070 8GB, 16.0 inch 4K OLED",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Raider GE78 HX 14V",
            brand = "MSI",
            price = "89.990.000₫",
            description = "Core i9-14900HX, RAM 64GB, SSD 2TB, RTX 4090 16GB, 17.0 inch QHD+ 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "MSI Commercial 14 H",
            brand = "MSI",
            price = "23.500.000₫",
            description = "Core i7-13700H, RAM 16GB, SSD 512GB, Tích hợp NFC + Đọc thẻ từ, Win11 Pro",
            imageResId = 0
        ),

        // ==========================================
        // 7. MICROSOFT (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "Surface Laptop 7",
            brand = "MICROSOFT",
            price = "20.690.000₫",
            description = "SNAPDRAGON X PLUS, RAM 16GB, SSD 512GB, 14 inch 2k, Win11",
            imageResId = R.drawable.mic_1
        ),
        ProductEntity(
            name = "Surface Laptop Studio 2",
            brand = "MICROSOFT",
            price = "75.900.000₫",
            description = "Core i7 13700H, RAM 64GB, SSD 2TB",
            imageResId = R.drawable.mic_2
        ),
        ProductEntity(
            name = "Surface Go 3",
            brand = "MICROSOFT",
            price = "13.500.000₫",
            description = "Pentium Gold 6500Y, RAM 8GB, SSD 128GB, 10.5 inch PixelSense Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Laptop Go 2",
            brand = "MICROSOFT",
            price = "14.990.000₫",
            description = "Core i5-1135G7, RAM 8GB, SSD 128GB, 12.4 inch PixelSense Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Laptop Go 3",
            brand = "MICROSOFT",
            price = "18.990.000₫",
            description = "Core i5-1235U, RAM 8GB, SSD 256GB, 12.4 inch PixelSense Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Pro 8",
            brand = "MICROSOFT",
            price = "19.500.000₫",
            description = "Core i5-1135G7, RAM 8GB, SSD 256GB, 13.0 inch PixelSense 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Pro 9",
            brand = "MICROSOFT",
            price = "24.990.000₫",
            description = "Core i5-1235U, RAM 8GB, SSD 256GB, 13.0 inch PixelSense Flow 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Pro 9 SQ3 5G",
            brand = "MICROSOFT",
            price = "29.990.000₫",
            description = "Microsoft SQ3, RAM 16GB, SSD 256GB, Hỗ trợ Nano SIM + eSIM 5G",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Pro 10 For Business",
            brand = "MICROSOFT",
            price = "34.500.000₫",
            description = "Ultra 5 135U, RAM 16GB, SSD 256GB, 13.0 inch Chống chói PixelSense",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Pro 11 Copilot+ PC",
            brand = "MICROSOFT",
            price = "31.990.000₫",
            description = "Snapdragon X Plus, RAM 16GB, SSD 256GB, 13.0 inch LCD 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Pro 11 OLED Copilot+ PC",
            brand = "MICROSOFT",
            price = "43.990.000₫",
            description = "Snapdragon X Elite, RAM 16GB, SSD 512GB, 13.0 inch OLED 120Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Laptop 5 13.5 inch",
            brand = "MICROSOFT",
            price = "24.500.000₫",
            description = "Core i5-1235U, RAM 8GB, SSD 512GB, 13.5 inch PixelSense Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Laptop 5 15 inch",
            brand = "MICROSOFT",
            price = "31.990.000₫",
            description = "Core i7-1255U, RAM 16GB, SSD 512GB, 15.0 inch PixelSense Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Laptop 6 For Business",
            brand = "MICROSOFT",
            price = "36.990.000₫",
            description = "Ultra 7 165H, RAM 16GB, SSD 512GB, 13.5 inch PixelSense Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "Surface Laptop 7 15 inch",
            brand = "MICROSOFT",
            price = "38.990.000₫",
            description = "Snapdragon X Elite, RAM 16GB, SSD 512GB, 15.0 inch 120Hz Touch",
            imageResId = 0
        ),

        // ==========================================
        // 8. LG (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "LG Gram Book",
            brand = "LG",
            price = "16.990.000đ",
            description = "I5-1334U, RAM 16GB, SSD 512GB , 15.6 inch FHD, Win11",
            imageResId = R.drawable.lg_1
        ),
        ProductEntity(
            name = "LG Gram 2024 Pro 16",
            brand = "LG",
            price = "33.990.000đ",
            description = "U7-155H, RAM 16GB, SSD 512GB , 16.0 inch FHD, Win11",
            imageResId = R.drawable.lg_2
        ),
        ProductEntity(
            name = "LG Gram 14 2023",
            brand = "LG",
            price = "24.990.000₫",
            description = "Core i5-1340P, RAM 16GB, SSD 512GB, 14.0 inch WUXGA 16:10, Siêu Nhẹ 999g",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram 15 2023",
            brand = "LG",
            price = "27.500.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 512GB, 15.6 inch FHD IPS, Pin 80Wh",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram 16 2023",
            brand = "LG",
            price = "30.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 1TB, 16.0 inch WQXGA (2560x1600)",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram 17 2023",
            brand = "LG",
            price = "34.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 1TB, 17.0 inch WQXGA IPS Anti-Glare",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram Style 14",
            brand = "LG",
            price = "32.990.000₫",
            description = "Core i5-1340P, RAM 16GB, SSD 512GB, 14.0 inch 2.8K OLED 90Hz Glass Design",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram Style 16",
            brand = "LG",
            price = "38.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 1TB, 16.0 inch 3.2K OLED 120Hz Touchpad Ẩn",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram 2-in-1 14 inch",
            brand = "LG",
            price = "29.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 512GB, 14.0 inch WUXGA Cảm ứng kèm Bút Wacom",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram 2-in-1 16 inch",
            brand = "LG",
            price = "35.500.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 1TB, 16.0 inch WQXGA Cảm ứng gập 360",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram Pro 17 2024",
            brand = "LG",
            price = "39.990.000₫",
            description = "Ultra 7 155H, RAM 32GB, SSD 1TB, 17.0 inch WQXGA 144Hz Anti-Glare",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram Pro 16 RTX 3050",
            brand = "LG",
            price = "42.990.000₫",
            description = "Ultra 7 155H, RAM 32GB, SSD 1TB, RTX 3050 4GB, 16.0 inch WQXGA 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Ultra PC 16 inch",
            brand = "LG",
            price = "18.500.000₫",
            description = "Ryzen 7 7730U, RAM 16GB, SSD 512GB, 16.0 inch WUXGA IPS 16:10",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram SuperSlim 15",
            brand = "LG",
            price = "31.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 512GB, 15.6 inch OLED Mỏng 10.9mm nặng 990g",
            imageResId = 0
        ),
        ProductEntity(
            name = "LG Gram 16 2022 RTX 2050",
            brand = "LG",
            price = "26.900.000₫",
            description = "Core i7-1260P, RAM 16GB, SSD 512GB, RTX 2050 4GB, 16.0 inch WQXGA",
            imageResId = 0
        ),

        // ==========================================
        // 9. GIGABYTE (2 Máy gốc + 13 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "Gigabyte G6",
            brand = "GIGABYTE",
            price = "21.990.000đ",
            description = "I7-13620H, RAM 16GB, SSD 512GB, 16.0 FHD+, Win11",
            imageResId = R.drawable.gi_1
        ),
        ProductEntity(
            name = "Gigabyte AORUS 16X",
            brand = "GIGABYTE",
            price = "38.490.000đ",
            description = "Core i7-14650HX, RAM 16GB, SSD 1TB, RTX 4070 8GB, 16 inch",
            imageResId = R.drawable.gi_2
        ),
        ProductEntity(
            name = "Gigabyte G5 GE",
            brand = "GIGABYTE",
            price = "15.990.000₫",
            description = "Core i5-12500H, RAM 8GB, SSD 512GB, RTX 3050 4GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte G5 MF",
            brand = "GIGABYTE",
            price = "18.490.000₫",
            description = "Core i5-12450H, RAM 16GB, SSD 512GB, RTX 4050 6GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte G5 KF",
            brand = "GIGABYTE",
            price = "20.990.000₫",
            description = "Core i5-12500H, RAM 16GB, SSD 512GB, RTX 4060 8GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte G6X 2024",
            brand = "GIGABYTE",
            price = "29.990.000₫",
            description = "Core i7-13650HX, RAM 16GB, SSD 1TB, RTX 4060 8GB, 16.0 inch FHD+ 165Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte AORUS 15 9KF",
            brand = "GIGABYTE",
            price = "27.990.000₫",
            description = "Core i5-12500H, RAM 16GB, SSD 512GB, RTX 4060 8GB, 15.6 inch QHD 165Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte AORUS 15 BSF",
            brand = "GIGABYTE",
            price = "35.990.000₫",
            description = "Core i7-13700H, RAM 16GB, SSD 1TB, RTX 4070 8GB, 15.6 inch QHD 165Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte AORUS 17 YE5",
            brand = "GIGABYTE",
            price = "45.000.000₫",
            description = "Core i7-12700H, RAM 32GB, SSD 1TB, RTX 3080Ti 16GB, 17.3 inch FHD 360Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte AORUS 17X AXF",
            brand = "GIGABYTE",
            price = "69.990.000₫",
            description = "Core i9-13900HX, RAM 32GB, SSD 2TB, RTX 4080 12GB, 17.3 inch QHD 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte AERO 14 OLED BMF",
            brand = "GIGABYTE",
            price = "34.990.000₫",
            description = "Core i7-13700H, RAM 16GB, SSD 1TB, RTX 4050 6GB, 14.0 inch 2.8K OLED 90Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte AERO 16 OLED BSF",
            brand = "GIGABYTE",
            price = "46.990.000₫",
            description = "Core i7-13700H, RAM 32GB, SSD 1TB, RTX 4070 8GB, 16.0 inch 4K+ OLED 100% DCI-P3",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte AERO 16 OLED Ultra 9",
            brand = "GIGABYTE",
            price = "58.990.000₫",
            description = "Core i9-13900H, RAM 32GB, SSD 2TB, RTX 4070 8GB, 16.0 inch UHD+ OLED",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte U4 UD",
            brand = "GIGABYTE",
            price = "12.500.000₫",
            description = "Core i5-1155G7, RAM 8GB, SSD 512GB, 14.0 inch FHD Siêu Nhẹ 990g",
            imageResId = 0
        ),
        ProductEntity(
            name = "Gigabyte M6842",
            brand = "GIGABYTE",
            price = "14.990.000₫",
            description = "Core i5-1240P, RAM 16GB, SSD 512GB, 16.0 inch FHD IPS, Win11",
            imageResId = 0
        ),

        // ==========================================
        // 10. LENOVO (15 Máy mới `imageResId = 0`)
        // ==========================================
        ProductEntity(
            name = "Lenovo Ideapad Slim 3 14",
            brand = "LENOVO",
            price = "11.490.000₫",
            description = "Core i3-1305U, RAM 8GB, SSD 512GB, 14.0 inch FHD IPS, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo Ideapad Slim 5 16",
            brand = "LENOVO",
            price = "18.990.000₫",
            description = "Ryzen 7 7730U, RAM 16GB, SSD 512GB, 16.0 inch WUXGA IPS",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo Yoga Slim 6 14",
            brand = "LENOVO",
            price = "20.990.000₫",
            description = "Core i5-1340P, RAM 16GB, SSD 512GB, 14.0 inch 2.2K IPS 100% sRGB",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo Yoga Slim 7 Pro",
            brand = "LENOVO",
            price = "25.490.000₫",
            description = "Ryzen 7 7840HS, RAM 16GB, SSD 512GB, 14.5 inch 3K 120Hz OLED",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo Yoga 9i Dual Screen",
            brand = "LENOVO",
            price = "49.990.000₫",
            description = "Core i7-1360P, RAM 16GB, SSD 1TB, 2 màn hình 13.3 inch 2.8K OLED Touch",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo ThinkPad E14 Gen 5",
            brand = "LENOVO",
            price = "17.890.000₫",
            description = "Core i5-1335U, RAM 16GB, SSD 512GB, 14.0 inch WUXGA IPS, Win11",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo ThinkPad L15 Gen 4",
            brand = "LENOVO",
            price = "21.500.000₫",
            description = "Core i5-1335U, RAM 16GB, SSD 512GB, 15.6 inch FHD, Win11 Pro",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo ThinkPad T14 Gen 4",
            brand = "LENOVO",
            price = "31.990.000₫",
            description = "Core i7-1355U, RAM 16GB, SSD 512GB, 14.0 inch WUXGA 400 nits",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo ThinkPad X1 Carbon Gen 11",
            brand = "LENOVO",
            price = "46.990.000₫",
            description = "Core i7-1360P, RAM 32GB, SSD 1TB, 14.0 inch 2.8K OLED 400 nits",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo LOQ 15IAX9",
            brand = "LENOVO",
            price = "16.990.000₫",
            description = "Core i5-12450HX, RAM 12GB, SSD 512GB, RTX 2050 4GB, 15.6 inch FHD 144Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo LOQ 15IRX9 2024",
            brand = "LENOVO",
            price = "23.990.000₫",
            description = "Core i5-13450HX, RAM 16GB, SSD 512GB, RTX 4050 6GB, 15.6 inch FHD 144Hz 100% sRGB",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo Legion Slim 5 16",
            brand = "LENOVO",
            price = "32.990.000₫",
            description = "Ryzen 7 7840HS, RAM 16GB, SSD 512GB, RTX 4060 8GB, 16.0 inch WQXGA 165Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo Legion Pro 5 16",
            brand = "LENOVO",
            price = "39.990.000₫",
            description = "Core i7-13700HX, RAM 16GB, SSD 1TB, RTX 4070 8GB, 16.0 inch WQXGA 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo Legion Pro 7i 2024",
            brand = "LENOVO",
            price = "72.990.000₫",
            description = "Core i9-14900HX, RAM 32GB, SSD 1TB, RTX 4080 12GB, 16.0 inch WQXGA 240Hz",
            imageResId = 0
        ),
        ProductEntity(
            name = "Lenovo ThinkBook 14 G6",
            brand = "LENOVO",
            price = "15.490.000₫",
            description = "Core i5-1335U, RAM 16GB, SSD 512GB, 14.0 inch WUXGA IPS, Vỏ nhôm",
            imageResId = 0
        )
    )
}