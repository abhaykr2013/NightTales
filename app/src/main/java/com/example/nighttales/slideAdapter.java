package com.example.nighttales;


import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

class slideAdapter extends PagerAdapter {

    //list of description
    public String[] des_lst =
            {

                    "It all began when I joined my first job. I was a B.Com graduate and had just joined the HCL in an international process named ATNT. Being the first one to get a job in the entire    batch, I was happy and eager to work for my maiden project. I was 21 from a middle class family and my parents were happy to know that I would be working in an MNC at that very young age. Jamshedpur was my birthplace where I had completed my schooling and after spending 19 years of life, I had moved to Delhi for my higher education.I did my B.Com from Shri Arobindho College of Commerce, Delhi University.My scores in the boards were average but somehow I managed to make for the third cut off list.",

                    "However, I was hired for a salary of Rs. 15,000 and was more than enough for me at that time. I had a roommate and the room rent was 7000 which was shared by the two of us. My food expense was hardly Rs. 50-70 per day, so I had enough money left to spend on shopping and to send some to my parents. February 2, 2013 —It was my induction day. There were 21 more people who had joined the HCL that day. We were a batch of 22 people consisting of 14 boys and 8 girls. Excluding the married and the committed ones, there were 5 girls who were single. I was a shy boy when it came to girls. I hardly spoke to them. It is not that I didn't have interest  in a relationship but I knew ",
                    "what I had in me. Nothing! Neither I was good looking, nor was I good at something. I was 21 and had a manly voice. My hair was long which added to my unwonted attributes. I was more than just obese and loved eating rice both in lunch and dinner. Being brought up in a Bengali family, I am fond of eating fish curry and rice. My skin tone was dark and I looked like a bear. A portly bear. The training began the next day. We were informed that our training would go for 2 months. My roommate Ankit had been working with DELL since 3 years then and   had already briefed me about the life in BPO. This training period is popularly known as the honeymoon period. ",
                    "It's like attending lectures and getting highly paid for the same. Yes, you heard me right! We were taught same as in schools or colleges. We had assignments and tests every week. I was in smoker's gang as I too smoked. I am a chain smoker. Yes, friends' groups in offices are formed on the basis of your habits. There are basically 3 kinds of groups. 'The smoker's gang', 'the family gang' and 'the other one'. These groups usually can be found everywhere. Be at class, cafeteria or outings. The most suspicious group was the other gang. They neither shared their tiffin nor spoke much. Anirban, Aman , Sanjay, Komal, Divya and I became good friends. I soon had to buy a smart phone as I had to join the office WhatsApp group. ",
                    "We went out on numerous outings and had a wonderful time. Starting from visiting Red Fort to bowling at Appu Ghar at GIP Mall, we did everything. Everything was fine till the assessment day. But this smoothness came to an end. Our group was broken by the results. Sanjay, Divya and I cleared the exam but the rest couldn't. Komal had tears in her eyes as they were asked to leave. The next few days didn't go so well. The WhatsApp group became numb and so were we. We moved further to our process training where we were taught about the ATNT process. Our trainer was a cool and handsome fellow. His name was Shubho and Divya had a crush on him. Later they got in a relationship and even got married ."
                    , " Since the training time, Divya and our trainer started dating and as a result our group got smaller. We were only left with 2; Sanjay and I. \n Artharv, everything is moving so fast! We were 6 and now left down to 2 of us.\" exclaimed Sanjay. \"Yes, you are right, but this is what we call life. Everyone has a part to play and as soon it is done, one walks away from our lives.I replied. Yes, but I never thought this would be for such a small period of time!\"It seems like it all happened yesterday!\" The process training got over within three weeks and everyone cleared the mock calls. We moved to floor and were in the nesting team headed by Romit sir. "
                    , " Our final team was to be decided according to the performance during nesting period.I was the only one who made a sale in the entire team and became the 4th one in the entire history of the process to do so. This grabbed the attention of the entire team leaders and I was in demand. I was in the technical process and we had to pitch for a service to the customers and if they agreed to buy that service, we got a sale and an incentive for the same. In the weeks further, I made 2 more sales which made a record of the highest sale ever by an agent in nesting period. April 4, 2013 — Nirman sir had selected me for his team. I personally wanted to go to his team as well. His team, The New York Yankees had the highest sales in the process.",

                    " I was very happy and delighted to be chosen in the team. \n Nirman sir introduced me to the team and praised me for my achievement. Everyone was amazed and welcomed me whole heartedly. I just barged the calls as I was new to the team.",


//************** CHAPTER 2************************//
                    "I was given a week off for the next 2 days and I joined office back on Monday. I still remember the date. It was 7th of April 2013, when I saw her for the first time. I was already pumped up by the appreciations and praises which I received throughout the nesting period. It was a graveyard shift (a shift after 12:00 AM) and it was for the first time I was doing that shift. It was pathetic! Waking up at midnight was awful. Being first time in a main team, I didn't stop at the cafeteria as I wanted to gain some first day impression. When I reached my workstation, I was the only one present in the bay. As I knew the process and tools, I quickly logged in one of the computers. ",
                    " I was opening all my tools for picking up the calls, when suddenly someone said,\"Hey Mr. that's my seat\". \n" +
                            "\"Hello ma'am, I am extremely sorry! I had no clue about this. I am new to the team. My name is Artharv.\" \n" +
                            "\"It's fine. Take care about this from the next time.\" \n" +
                            "\"Of course ma'am.\" \n" +
                            "I was a bit puzzled. I quickly left that seat and went outside. I went to cafeteria and ordered my favorite chicken salami sandwich. Sanjay joined in too. We talked about the incident which had just taken place and had a bit of fun.",
                    "I went back to my bay and found the entire team there. Everyone smiled including my team leader, 'Nirman sir'. \n" +
                            "\"Team, lets welcome Artharv.\" alleged Nirman sir. \n" +
                            "Everyone clapped and was happy to receive \n" +
                            "me. \n" +
                            "\"One more thing, he is the fourth one to get \n" +
                            "a sale in the nesting history and the first to \n" +
                            "get three sales.\" \n" +
                            "The cheer and clapping roared. I was very \n" +
                            "happy with the welcome I received in the \n" +
                            "team. \n" +
                            "\"So Priyanshi, now you have someone who \n" +
                            "can give you tough competition\".\n",
                    "May God bless him so that he may also achieve what I have already achieved! May be, a bit more!\" said Priyanshi. On this note I came to know that girl's name was Priyanshi. She was the one who was not happy with me sitting in her reserved seat. \n She was fair in complexion, straight hair and blond curls, indo-western dressing style and cat frame specs which made her look cuteful (combination of cute and beautiful). She was the highest selling agent for consecutively 5 months and had earned an incentive of Rs. 1, 67,000. The next agent was way behind with only Rs. 79,000. She was dominating this sector of the company. On an introduction, I came to know about other members of team  ",
                    " but she had something which was making me inclined towards her. It was for the first time, I didn't watch a girl as a friend or a sister. She had joined HCL 9 months back and been quite popular in the floor for her outstanding performances. The day went by learning new ways and some tactics for pitching for sale. The next day, I took the next seat to Priyanshi purposely. I wanted to talk to her and somehow manage to be her friend. \n \n''Hey Mr.! That's my friend Niharika's seat''.\n ''Oh! I am sorry again ma'am. I didn't know this either. Can you assign me a seat near to you ma'am?''\n",
                    "\n ''Why?'' \n" +
                            "\"I want to observe and learn the ways you use to make a sale!\" \n" +
                            "\"You seem very desperate to earn!\" \"Trust me, I am.\" \"See Mr., I cannot do that. You have to talk to Nirman sir about this. Everyone has a fixed seat and I guess no one will be happy to give his/her seat.\" \n" +
                            "\"Okay ma'am, I will talk to sir about this\". \"Okay\". \"By the way, my name is Artharv\". \"I know!\" \n" +
                            "There was an awkward silence as I was devastated and had no idea what to say further. She knew my name but still denied to call me by the same! A series of random thoughts went aside. Did she keep a pet name? Is she happy with my dedication towards work? Is she jealous of my achievements? \n",
                    "As directed by her, I spoke to Nirman sir about my seating arrangement. He agreed and allowed me to sit at Niharika's seat for a week. As expected, Niharika wasn't happy at all with this change. Priyanshi didn't look either. So the day started well for me but not for them. I observed her carefully about how she spoke to customer and the way she pitched in for the sale. She had a soft tone voice and spoke fluent American English. She was so mesmerizing that I couldn't take my eyes off her.\n" +
                            "\"Hey! Are you learning something or just staring at me?\" \"No ma'am, I am not staring. I mean, I was listening carefully and thus may be looking a bit awkward!\" \n" +
                            "\"You better learn something\". \n" +
                            "\"I will ma'am!\" \n",
                    "My heart almost skipped a heartbeat. She was right. I was busy staring at her. She was beautiful. Taking off eyes from her was a sin. 3 days passed by and I had just learnt that her eyebrows were neatly threaded. She only applied eye liner on her upper eyelid, she used baby lips to moisturize her lips and her spectacles were for Titan Eye+. \n" +
                            "On the 4th day she asked out of curiosity, \"Will I look good without specs?\" \n" +
                            "\"No! This makes you more beautiful\" \n" +
                            "\"What?\" \n" +
                            "\"Seriously, it looks good on you!\" \"And why are you answering the question which I asked to Niharika?\" \"Oh! I thought you are asking me!\" \"You think too much Mr.!\" \n",
                    "I was so busy lost in her thoughts that I didn't realize that the question was for her friend. I was feeling terrible and ashamed. I quickly managed to run away from my workstation to the smoking area. I was caught admiring her! I smoked two cigarettes one after the other but it didn't helped either to calm me down. It was over. She now knew everything. I went back to my workstation and started to take my calls. I didn't look at her for the rest of the day. On the fifth day, I went directly to Nirman sir and asked to give a permanent seat. \"So, have you learnt everything?\" \n" +
                            "\"Yes sir!\" \n" +
                            "\"Niharika is on leave for 10 days starting today, so you can sit there for the moment. As soon as your laptop is ready, I will assign your seat.\" ",
                    "I was very afraid and tensed to sit beside her. What if Priyanshi asks something and I " +
                            "don't have an answer! What if she scolds me for my act? I somehow managed to sit beside her. I didn't speak to her. Few days passed by and neither of us spoke to each other. \n" +
                            "One day she asked something similar, \nSo, you think this spectacle makes me look beautiful?\nI heard the question, but didn't have the guts to answer it again. \"Hey Mr. I am talking to you! You think if I don't wear these glasses, I won't look good?\" \"I didn't mean that way ma'am.\" She removed her specs and asked again, \"So I don't look good this way?\"\n" +
                            "She looked like an angel. For the first time I saw her bare eyes with black mascara decorated well on the eyelids. ",
                    "\"You are beautiful ...\n\" And you are a nonsense Mr.!\" \n What?\" \n\"Have you joined this company to flirt with girls?\" \n\"But, I have never flirted in my whole life! Honestly speaking, I don't even know how to flirt? I just say what's in my heart.\" \n" +
                            "\"Oh, really?\"\n \"Ma'am, look at me once. Do you think I had girlfriends or I could impress any girl with some cheesy lines?\" \n" +
                            "She looked convinced and left the bay. I was very much discouraged with the moment which had just occurred. My heart was crushed and my first love story came to an end without even starting. The next few days were very depressing.",
                    " We didn't speak to each other; neither did I try to make any conversation. It was the end. \n" +
                            "Sometimes, life seems very hard. Everything is going wrong and you are struggling hard to somehow escape! This is the test you need to pass, else you fail forever. Weeks passed by, and my performance was getting better as I was only concentrating on incentive part. I had made 16 sales in 2 weeks which made me the 6th highest selling agent in the team. Priyanshi had 42 sales and was the highest among all the teams. A month passed by and my team leader Nirman sir was very happy with our performances. \"Arthary ended with 24 sales this month, Aamir with 29, Antesh with 36 and Priyanshi with 48.",
                    "\"Can we have huge round of applause for these guys?\"\n I was happy to be in the top list of the team. \n\"So, Mr. champ, 24 sales, wonderful! Keep going!\" \n\"Thank you ma'am, it is all because of you and your tips.\" \n\"Seriously! Do you really mean it or you are flirting again?\" \n" +
                            "\"I was neither flirting that day nor am I now. I just speak what is in my heart.\" \n\"Ya, Ya, I know. Would you like to join me and Niharika at cafeteria? The treat is on me. \n" +
                            "\"Sure, but what is the treat about?\"\n \"Your 24 sales stupid.\" \n\"Then why are you treating me! ",
                    "\"She pulled my cheek and said, \"You are really stupid Mr.\"\nI later realized that she was the highest selling agent of the month and thus she was celebrating it.",

                    //***************************************************chapter 3 trip to manali*****************************************8

                    "0ur team had made over 150 sales and thus was gifted 2 days tour to Manali. We were all excited and especially I as it was my first office trip. We took our bus from Kashmiri gate bus terminal. We were 15 including 8 boys and 7 girls. Priyanshi, Niharika and I sat together. Priyanshi had taken the window seat, mid was occupied by Niharka and I took the adjacent seat. \n" +
                            "\"You like her, right?\" asked Niharika. \"Who?\" \"Priyanshi?\" \"No! No! No!\" \n" +
                            "\"Don't lie! I know everything that happened between you and her. And it's quite clear about your feelings.\" \n" +
                            "\"No!\" \n",
                    "When the entire world knows that she is your crush, you pretend hard to convince them she is just your friend! \"What are you both talking about?\" asked Priyanshi. \"Do you know Arthary is in love?\" replied Niharika. \"Ya, I guess I know, he is acting a bit weird these days!\" \n" +
                            "\"No, I am not in love or any other things like this.\"\n" +
                            "\"So you don't love me?\" \"No! I mean yes, but not like that. I mean no.\" \n" +
                            "I was completely taken back by the question asked by Priyanshi. A mixed emotion of happiness, anxiety and nervousness was running through my veins.",
                    " My heart was beating vigorously and my brain had lost control over my tongue.\n \"See this Mr. can't even make up his mind and suggests me to wear specs because it makes me look beautiful.\" \n" +
                            "They both laughed and I watched her laughing. That night everyone slept except me. I continued thinking about her the \n" +
                            "whole night. The same feelings reunited which I had for her a few months back. \n" +
                            "We got down at Manali early in the morning and checked in to our hotel. The rooms were quite spacious and two persons were allotted a single room. I was the fortunate one to get a single room. It was smaller but privacy ",
                    "was also a was also a matter of concern. After having our breakfast, we went out for outing to see snow at higher altitude. It was cold and freezing. I was amazed by the scenic beauty of the place. I was taking some snaps when I was hit by snow ball from somewhere. It was Priyanshi. I responded quickly. I made a ball out of snow and threw it on her and this continued for a long time. We played like kids. Niharika was attacked continuously by me and Priyanshi. We went back to a restaurant and had our lunch. We sat together. There I came to know that Priyanshi loved chicken as well.We had ordered chilly chicken and fried rice. It was  ",
                    "delicious. While Priyanshi had gone to the washroom, Niharika said, \"I can help you if you really love her!\" \"No dear, there are no feelings as such. She is just a good friend of mine\" \"Ya, I know! In case you gain the guts to say the truth, do ask for help.\" \"How can you help me?\" \"You really love her a lot, right?\" \n" +
                            "\"I had fallen in love with her from the moment I had seen her for the first time.\" \n" +
                            "\"Oh really! That's so cute!\" \"What you both are discussing about?\" asked Priyanshi. \"We were talking about how Arthary is hiding his love and is unable to convey it\" Niharika replied. ",
                    "\"Arthary says what his heart says. I don't think he should face any difficulty in conveying his message. So Artharv, who is the lucky one?\" \n" +
                            "\"It's you!\" exclaimed Niharika. \"What !\" reacted Priyanshi \"What! No, never\" somewhat saving myself from the situation and giving an intense look to Niharika.\n" +
                            "\"l was just messing up with you Priyanshi,\" said Niharika. We went back to our rooms. I was planning to give her a call but didn't have the confidence. I fell asleep that afternoon. I woke up in the evening at around 7pm and found 2 missed calls from Priyanshi and 1 from Niharika.  ",
                    "I went outside to search for them but they had left for the theatre to watch a movie. I cursed myself to miss a chance to stay with Priyanshi. I went back to my room, moved the curtains and lit a cigarette. The lights sparkled in the mountains of Manali and smoke of tobacco was the perfect essence. After smoking a cigarette, I was shutting the window when I saw Priyanshi in the lawn. She was writing something in a dairy. I was very happy to see her. I quickly ran downstairs to the lawn.\n \"Hey, what are you doing here out in cold?\" \"Hi Artharv, I am writing my next book. Would you like to read it?\"",
                    "\"Yes, sure\" And that was the first day when I read a novel. Honestly speaking I didn't understand many words and kept on asking for the meanings. She laughed at my poor vocabulary but explained each one of them patiently. She was writing her third book and her last two books had made an average sale of 800 and 1100 copies. She loved writing and aspired to become one of the biggest authors in India. She had high expectations from this book as she was not pleased with the first two responses. Her dream was to write a book which at least sold 5000+ copies so that it would become a national bestseller.",
                    "\"So, you don't read books?\"\n\"No, I hardly could manage the syllabus books. Novels are way beyond my limits.\"\n \"Reading books is a good habit and you should try it too.\" \n\"I will read your book, I promise.\" She smiled. \n\"Am I so bad?\" \n\"No, why are you saying so?\" \n\"You said you can never fall in love with me.\" \n\"l didn't mean that way' , I somehow tried to dodge the question. \"Do you know? I have never fallen in love with anyone.\" \n\"Never?\" \n\"No! I have some dreams to fulfill. I want to become a big writer one day. Indeed, a national best seller.I want people to love my work and  ",
                    "send notes, emails and messages full of appreciations. I want people to fall in love with my stories and learn some lessons regarding life.\"\n" +
                            "\"You will definitely become one day. I don't read books but this story forced me to read more.\" \"You are really sweet Artharv.\" \"No, I am not sweet at all. You can taste me if you don't believe!\" I said ironically. She kissed! \"You are!\" and she left. Everything was so sudden that it took almost a minute to understand the current accomplishments. Did she really kiss me or it was a hallucination! And if she kissed me, why did she kiss me? A lot of questions were hovering in my mind.   ",
                    "I quickly ran upstairs to her room. I knocked. She opened the door. She was in tears. I quickly went inside and closed the door. Before I could ask anything, she hugged me. She held me tight and burst out in tears. \"I have no one in my life. My parents got divorced when I was 16. My parents abandoned me. I use to swing from my father's house to my mother's house for food and shelter. I have cried a lot in my life Artharv, don't want it anymore.\" I hold her more tightly and listened carefully to what she was saying. \"Sorry Arthav, if you felt bad about the kiss. It just felt right. I too want to be loved and pampered.\"",
                    "\"Hey listen Priyanshi, I love you and I love you since the first day I saw you.\" She kept sobbing and I tried to calm her down. \"Look at me Her face was all washed with tears. We looked at each other and not a word passed between us. I could feel the warm air which was coming out of mouth. We kissed! This was for a longer time. We both felt a connection between us. Her mild lips bit mine as if she wanted them since decades. She took a step further. She slipped her hands in my t-shirt. I pulled her closer. I picked her and took her to the bed.I removed my t-shirt. She asked me to switch off the lights. I obeyed her. I went back to her.",
                    "We kissed again. I grabbed her tight, removed her top. My hands went to her bra and tried to open it but failed. She smiled and helped me unhooking it. We covered ourselves with a blanket. We gradually made each other naked. Her body was hot and she had goose bumps. We kissed and made love to each other. It was the first time I had sex, saw a girl naked and lost my virginity. So much was happening in one single night. I was happy and anxious. She slept after making love. And I watched her sleeping. Yes, she looks beautiful without specs. I had texted Niharika to use my room as this room was occupied. The next morning I woke up late.. I found Niharika and Priyanshi giggling and having their breakfast.",
                    " I got up and went to find out the reason. \n\"So how was the last night?\" asked Niharika. \n\"It was good, \"l replied. \n\"Only good?\" asked Priyanshi and they started to giggle again. Now, I knew the topic of their discussion.\n \"The best night ever!\" \n\"Ahm Now don't start giving the details,\" exclaimed Niharika. \"I am so happy for both of you.\" Priyanshi hugged me and said, \"Me too.\" We left for Delhi that afternoon. This time Priyanshi sat beside me. We reached Delhi at 9pm. I dropped her home and went back to mine.",
                    "The news was everywhere that I proposed Priyanshi and she said yes! We were a delighted pair and flaunted our relationship proudly. We were given the name \"sales champ couple\"",

                    //********************************************************chapter 4 our MARRIGE*******************************************
                    "For the next few months we did everything together. I used to make a call to wake her up. We had our breakfast together at company's cafeteria. We sat together, went for shopping together. And I managed to break her record of 56 sales by a margin. I became the agent of month for consecutive 3 months. We both earned well. My family loved Priyanshi. After one year relationship, we got married in the year 2015. HCL had gifted us our honeymoon package to Mauritius. We joined back a week later. Everyone was happy to see the sales champ couple now as a married couple.",
                    " Nirman sir made sure to keep our shifts at the same time so that we get more time to spend together having Priyanshi beside me was everything I had ever dreamt of.  I was happy",

                    //*********************************             CHAPTER 4 THE DAY*******************************************88
                    "Nothing is permanent in life. If someone says nothing is impossible, rather he/she doesn't know what life is. October 30, 2015 Priyanshi was getting ready for her shift. I was having my dinner, when I heard her collapsing at the bathroom. I broke the door. She was lying on the floor. I quickly took her to the hospital. My parents were happy because they assumed that she might be expecting baby. But this happiness was soon shattered when report came the next day. She was suffering from blood cancer. Fortunately, it was in the first stage and could be cured. She left her job and enrolled herself in the cancer therapies and treatments. She resumed writing her book and soon completed it within a month. ",
                    "She named the book The Bestseller. Months passed by and after series of therapies it was time for the tests and reports. She had submitted her manuscript to 'Gulmohur Publications'. They loved the story and decided to publish it. It was a happy day for her. She had big hopes with this book. But all the happiness was strained at one go. The reports were negative again! It seemed her organs were not accepting the blood, and cancer had spread throughout the body. We moved her to AllMS, Delhi for better treatment. I was getting weaker and was afraid of the circumstances. \n" +
                            "She was strong by heart but she was in bed and collapsing every day. She knew she didn't have time and thus asked me to talk to ",
                    " the publishers to release the book as soon as possible.I spoke to the team and explained them the situation. They said they will try but couldn't promise. The doctors at AllMS had given up and said she could hardly survive a week or 10 days. I was shattered and couldn't speak a word. I went upstairs to the terrace, searched for a corner and cried out loud. I was on my knees crying and shouting in pain and agony. I was helpless and could do anything to save my wife. I went to her room. She knew what the doctors had said. She asked me to sit beside her. She held my hand and said, \"Hey Mr.! Why are you behaving as if I am gone?\" \"Don't say \" ",
                    "So did you decide whether I will look good without specs?\"\"Yes, you look gorgeous in every way?\" \"Will you always love me?\" \"You are too sweet\" she pulled my cheek. I kissed her forehead and asked her to take rest. Two days later, I received a call from Gulmohur team to collect the sample copy of the book. They had worked day and night for this book so that it could be released within a week on the special request of my wife (I am still obliged to them for their kind deed). I went to their office in Gurgaon and took the sample copy and ran to AIMS to show Priyanshi her dream book. My clothes were wet as I was running through the corridor.",
                    " I pushed the door and went inside the room. She was sleeping.. I walked unhurriedly so that she shouldn't get disturbed. I went closer to her and whispered, \"Hey, your dream is in my hand.\" She didn't respond. I tried to wake her up by holding the book in front of my face, so that she could see her dream just after opening the eyes. But she didn't wake up either. I tried and tried till I cried. She had left me and this world forever... ",

                    //******************************************CHAPTER 5 TODAY********************************

                    "I am still working with HCL and now promoted as an Asst. Manager. The Bestseller sold over 25 million copies and has become an international bestseller. All the royalties go to an NGO, working for cancer patients. Priyanshi has a fan page on facebook named 'The Best Seller by Priyanshi.' She still receives a lot of messages, emails and hand written letters, full of appreciations and good wishes. She might be reading all of them and smiling because she is now amongst the biggest authors of India.\n" +
                            "\n",


            };
    Context context;
    // list of titles
    //public  String []title_lst={"MY FIRST JOB","","","","","","","","",
    //                             "I MET HER","","","","","","","","","","","","","",
    //                          "TRIP TO MANALI","","","","","","","","","","","","","","",
    //                           "OUR MARRIGE","",
    //                            "THE DAY","","","","",
    //                           "TODAY"};
    LayoutInflater inflater;
    String st;
    int items;

    //********************************STORY CONTENT- 26 PAGES*******************************************************************************////
    private ArrayList<String> discriptions,headers;



    public slideAdapter(Context context,String st,int items) {
        headers = new ArrayList<>();
        discriptions=new ArrayList<>();
        this.context = context;
        this.st=st;// story name
        this.items=items;// total no. of files
    }
    int i = 1;
    private void tringBuilder() throws IOException {

        if (i < items) {
            while (i < items) {
                File text = new File(Environment.getExternalStorageDirectory(), "Download/Story/The Best Seller/1.txt");
                MainActivity.ReadingFile(text.getPath(), headers);

                i++;
            }
            int i=0;
            while (i < items) {
                File dis = new File(Environment.getExternalStorageDirectory(), "Download/Story/The Best Seller/2.txt");
                MainActivity.ReadingFile(dis.getPath(), discriptions);
                i++;


            }

        }
    }

    @Override
    public int getCount() {
        return items+1;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        // LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearview);
        TextView title = view.findViewById(R.id.tv1);
        TextView description = view.findViewById(R.id.tv2);
        try {
            tringBuilder();
        } catch (IOException e) {
            e.printStackTrace();
        }
       // Log.d("inside intantiate item",headers.get(position));
        if (position <headers.size())
            title.setText(headers.get(position));
        description.setText(discriptions.get(position));  // throws error because discription.get(44) has nothing.
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);

    }

}

