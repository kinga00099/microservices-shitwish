package com.codecool.shitwish.presentservice.config;

import com.codecool.shitwish.presentservice.model.Present;
import com.codecool.shitwish.presentservice.service.PresentStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class PresentInitializer {

    @Autowired
    private PresentStorage presentStorage;

    @Bean
    public CommandLineRunner init() {

        return args -> {

            Present tennisBall = Present.builder()
                    .title("Tennis ball")
                    .description("Barely used tennis ball for sale")
                    .price(10)
                    .image(new URL("https://5.imimg.com/data5/WQ/LY/MY-44813490/tennis-ball-500x500.jpg"))
                    .build();

            Present brick = Present.builder()
                    .title("Brick")
                    .description("As the title says. It's a brick for sale...")
                    .price(1)
                    .image(new URL("https://2ecffd01e1ab3e9383f0-07db7b9624bbdf022e3b5395236d5cf8.ssl.cf4.rackcdn.com/Product-800x800/94fe8692-b10a-4d47-9e40-e3e2361c703a.png"))
                    .build();

            Present passport = Present.builder()
                    .title("Passport")
                    .description("Hungarian passport for sale. No police officers pls")
                    .price(2000)
                    .image(new URL("http://www.promenad.hu/wp-content/uploads/2018/01/197584a0a69834edefeef66f79cd4275_big.jpg"))
                    .build();

            Present szalami = Present.builder()
                    .title("Szalámi")
                    .description("Sausage for sale. Phone call preferred")
                    .price(10)
                    .image(new URL("https://www.kolbaszaruhaz.hu/img/cms/ujabb%20kepek/teli-szalami-rud-vegl.jpg"))
                    .build();

            Present screwdrier = Present.builder()
                    .title("Screwdriver")
                    .description("Shitty screwdriver for sale")
                    .price(2)
                    .image(new URL("https://www.harborfreight.com/media/catalog/product/i/m/image_7873.jpg"))
                    .build();

            Present bmw = Present.builder()
                    .title("Bmw 850i")
                    .description("Shitty BMW 850i for sale. I asked for a Mercedes. Duh...")
                    .price(110000)
                    .image(new URL("https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/4616b562293441.5a8bd9bb93002.jpg"))
                    .build();

            Present kidney = Present.builder()
                    .title("Kidney")
                    .description("Selling my kidney! Exchange ONLY for iPhone XS!!!")
                    .price(700)
                    .image(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQG-isDbtSPtWUW1GJHBqsyrwcIlMv74JEVEIC7T7jLMrcRJ5Ch7g"))
                    .build();

            Present ring = Present.builder()
                    .title("Golden Ring")
                    .description("Selling my ring. Found it in the bottom of the local lake. Strange writings on it when it gets heat...")
                    .price(30)
                    .image(new URL("http://www.tolkienshop.com/contents/media/l_one_ring_gold_italian.jpg"))
                    .build();

            presentStorage.add(tennisBall);
            presentStorage.add(brick);
            presentStorage.add(passport);
            presentStorage.add(szalami);
            presentStorage.add(screwdrier);
            presentStorage.add(bmw);
            presentStorage.add(kidney);
            presentStorage.add(ring);
        };


    }





}
