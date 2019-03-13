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
                    .image(new URL("https://www.shbarcelona.es/blog/es/wp-content/uploads/2016/07/padel-singles-barcelona.jpg"))
                    .build();

            Present brick = Present.builder()
                    .title("Brick")
                    .description("As the title says. It's a brick for sale...")
                    .price(1)
                    .image(new URL("https://regmedia.co.uk/2015/10/09/adobe_54634545.jpg?x=442&y=293&crop=1"))
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
                    .image(new URL("https://www.workshopheaven.com/media/catalog/product/cache/1/image/1080x720/9df78eab33525d08d6e5fb8d27136e95/N/a/Narex-8094-Philips-Screwdriver-Set_9.jpg"))
                    .build();

            Present bmw = Present.builder()
                    .title("Bmw 850i")
                    .description("Shitty BMW 850i for sale. I asked for a Mercedes. Duh...")
                    .price(110000)
                    .image(new URL("https://periodismodelmotor.com/wp-content/uploads/2018/07/BMW-Serie-8-2019-1.jpg"))
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
                    .image(new URL("https://i.redd.it/15gpm2btqz811.jpg"))
                    .build();

            Present watch = Present.builder()
                    .title("Rolex watch")
                    .description("Rolex is for poor people")
                    .price(4000)
                    .image(new URL("https://www.rolex.com/content/dam/rolex-58/homepage/roller-collection/classic-watches/homepage_classic_watches_sky-dweller_0001_700x550.jpg"))
                    .build();

            Present plane = Present.builder()
                    .title("Private jet")
                    .description("Want something bigger...")
                    .price(30000)
                    .image(new URL("https://sherpareport.com/images/hire-jet-plane.jpg"))
                    .build();

            Present mom = Present.builder()
                    .title("Mom")
                    .description("I'd sell my mom")
                    .price(1)
                    .image(new URL("https://www.thelocal.it/userdata/galleries/4091/eating.jpg"))
                    .build();

            Present train = Present.builder()
                    .title("V 43 villanymozdony")
                    .description("V 43 for sale. Straight from MÁV garage. Delivery not possible")
                    .price(3000)
                    .image(new URL("https://upload.wikimedia.org/wikipedia/commons/b/b0/MAV_V43-1103_02.JPG"))
                    .build();

            presentStorage.add(tennisBall);
            presentStorage.add(brick);
            presentStorage.add(passport);
            presentStorage.add(szalami);
            presentStorage.add(screwdrier);
            presentStorage.add(bmw);
            presentStorage.add(kidney);
            presentStorage.add(ring);
            presentStorage.add(watch);
            presentStorage.add(plane);
            presentStorage.add(mom);
            presentStorage.add(train);
        };


    }





}
