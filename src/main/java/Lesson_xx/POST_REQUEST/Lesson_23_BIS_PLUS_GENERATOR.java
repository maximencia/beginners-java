package Lesson_xx.POST_REQUEST;

import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.PrintWriter;


import static java.lang.Short.valueOf;


public class Lesson_23_BIS_PLUS_GENERATOR {
    public static void main(String[]args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("test.csv"));
        StringBuilder sb = new StringBuilder();
        String[][] records = new String[120][49];
        String msisdn = "79052284114";
        for (int i=0; i<20; i++) {
            //REC_TYPE 09	Входящий SMS
            String[] record = {"09", "10929011", "", "", "250026593865701", "900F", "", "20180801120757", "0000", "00000000", "0", "", "", "359205075780080", "07", "00", "21", "", "", "9735", "63492", "0", "0", "", "", "", "79052284114", "0", "5", "", "0", "0", "", "", "", "", "", "79262000118", "MSS12_1.20180420120906CF0370.DAT", "", "0", "", "", "", "", "", "", "", "", ""};
            record[1] = String.valueOf(Long.parseLong(record[1]) + i);// меняем номер записи
            record[5] = String.valueOf(Long.parseLong(record[5].substring(0, 3)) + i) + record[5].substring(3);// меняем sourse number
            record[7] = String.valueOf(Long.parseLong(record[7]) + i * 1010101);// меняем дату звонка
            record[8] = record[8].substring(0, 4) + i;
            record[9] = record[9].substring(0, 6) + i;
            record[10] = String.valueOf(i);


            // заполним соты
            String REC_TYPE=record[0].replaceFirst("^0+(?!$)", "");
            record[19] = REC_TYPE + String.valueOf("000020");
            record[20] = REC_TYPE + String.valueOf("000021");
            record[21] = REC_TYPE + String.valueOf("000022");
            record[22] = REC_TYPE + String.valueOf("000023");


            records[i] = record;
            //System.out.println(records[1][1]);
            for (int j = 0; j < 49; j++) {
                pw.write(records[i][j] + ",");
                System.out.print(records[i][j] + ",");
            }
            pw.write("\n");
            System.out.print("\n");
            }

        for (int i=20; i<40; i++) {
            //REC_TYPE 01	Исходящий
            String[] record = {"01","10197653","","","250023038290736","79231954491","79295541505","20180801120757","1","0000030B","5","","","865815035057890","7","0","11","","","7712","9442","7712","9442","","","","79295541505","0","5","","0","3911","","","","","","79262000601","MSS01_1.20180424163500CF0342.DAT","9259921268","6","","", "", "", "", "", "", "", ""};
            record[1] = String.valueOf(Long.parseLong(record[1]) + i-19);// меняем номер записи
            record[5] = String.valueOf(Long.parseLong(record[5].substring(0, 3)) + i-19) + record[5].substring(3);// меняем sourse number
            record[7] = String.valueOf(Long.parseLong(record[7]) + (i-19) * 1010101);// меняем дату звонка
            record[8] =  String.valueOf(i) ;//record[8].substring(0, 4) + (i-19);
            record[9] = String.valueOf(Long.parseLong(record[9].substring(0, 3)) + i-19) + record[9].substring(3);// меняем sourse number
            record[10] = String.valueOf(i);
            record[5] = msisdn;

            // заполним соты
            String REC_TYPE=record[0].replaceFirst("^0+(?!$)", "");
            record[19] = REC_TYPE + String.valueOf("000020");
            record[20] = REC_TYPE + String.valueOf("000021");
            record[21] = REC_TYPE + String.valueOf("000022");
            record[22] = REC_TYPE + String.valueOf("000023");

            records[i] = record;
            //System.out.println(records[1][1]);
            for (int j = 0; j < 49; j++) {
               pw.write(records[i][j] + ",");
                System.out.print(records[i][j] + ",");
           }
            pw.write("\n");
            System.out.print("\n");
        }

        for (int i=40; i<60; i++) {
            //REC_TYPE 02	Входящий
            String[] record =   {"02","10223456","","","250026931486096","79264313801","79251543114","20180810163302","0181","00000000","5","","","354304081469600","07","00","11","","","7702","3786","7742","31707","","","","","0","5","","0","0","","","","","","79262000135","MSS13_2.20180424163704CF0068.DAT","","0","","","","","","","","",""}
                    ;
            record[1] = String.valueOf(Long.parseLong(record[1]) + i-39);// меняем номер записи
            record[5] = String.valueOf(Long.parseLong(record[5].substring(0, 3)) + i-39) + record[5].substring(3);// меняем sourse number
            record[7] = String.valueOf(Long.parseLong(record[7]) + (i-39) * 1010101);// меняем дату звонка
            record[8] =  String.valueOf(i) ;//record[8].substring(0, 4) + (i-39);
            record[9] = String.valueOf(Long.parseLong(record[9].substring(0, 3)) + i-39) + record[9].substring(3);// меняем sourse number
            record[10] = String.valueOf(i);
            record[6] = msisdn; //csv.type.02 = TRAFFIC_TYPE: 1,REC_TYPE: 0, IMSI_A: 4, MSISDN: 6,  DIALED: 5,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26

            // заполним соты
            String REC_TYPE=record[0].replaceFirst("^0+(?!$)", "");
            record[19] = REC_TYPE + String.valueOf("000020");
            record[20] = REC_TYPE + String.valueOf("000021");
            record[21] = REC_TYPE + String.valueOf("000022");
            record[22] = REC_TYPE + String.valueOf("000023");



            records[i] = record;
            //System.out.println(records[1][1]);
            for (int j = 0; j < 49; j++) {
                pw.write(records[i][j] + ",");
                System.out.print(records[i][j] + ",");
            }
            pw.write("\n");
            System.out.print("\n");
        }

        for (int i=60; i<80; i++) {
            //REC_TYPE 01	Исходящий
            String[] record = {"08","10897584","","","250204591113711","97852298234","79088832994","20180805162910","0000","00000000","0","","","354661084333710","00","00","22","","","9734","599","0","0","","","","9780882399F4FFFFFFFFFFFF","0","5","","0","0","","","","","","79262000601","MSS01_1.20180424163500CF0342.DAT","","0","","","","","","","","",""};
            record[1] = String.valueOf(Long.parseLong(record[1]) + i-59);// меняем номер записи
            record[5] = String.valueOf(Long.parseLong(record[5].substring(0, 3)) + i-59) + record[5].substring(3);// меняем sourse number
            record[7] = String.valueOf(Long.parseLong(record[7]) + (i-59) * 1010101);// меняем дату звонка
            record[8] =  String.valueOf(i) ;//record[8].substring(0, 4) + (i-59);
            record[9] = String.valueOf(Long.parseLong(record[9].substring(0, 3)) + i-59) + record[9].substring(3);// меняем sourse number
            record[10] = String.valueOf(i);
            record[5] = msisdn;

            // заполним соты
            String REC_TYPE=record[0].replaceFirst("^0+(?!$)", "");
            record[19] = REC_TYPE + String.valueOf("000020");
            record[20] = REC_TYPE + String.valueOf("000021");
            record[21] = REC_TYPE + String.valueOf("000022");
            record[22] = REC_TYPE + String.valueOf("000023");

            records[i] = record;
            //System.out.println(records[1][1]);
            for (int j = 0; j < 49; j++) {
                pw.write(records[i][j] + ",");
                System.out.print(records[i][j] + ",");
            }
            pw.write("\n");
            System.out.print("\n");
        }

        for (int i=80; i<100; i++) {
            //REC_TYPE 23 Интернет траффик
            String[] record = {"23","12397629","","","","79087440631","611","20180802162910","0000","00000015","8","","","","","","","","","","","","","","","","611","","8","","306","0","","","","","","79262000601","MSS01_1.20180424163500CF0342.DAT","","","","","","","","","","",""};
            record[1] = String.valueOf(Long.parseLong(record[1]) + i-79);// меняем номер записи
            record[5] = String.valueOf(Long.parseLong(record[5].substring(0, 3)) + i-79) + record[5].substring(3);// меняем sourse number
            record[7] = String.valueOf(Long.parseLong(record[7]) + (i-79) * 1010101);// меняем дату звонка
            record[8] =  String.valueOf(i) ;//record[8].substring(0, 4) + (i-79);
            record[9] = String.valueOf(Long.parseLong(record[9].substring(0, 3)) + i-79) + record[9].substring(3);// меняем sourse number
            record[10] = String.valueOf(i);
            record[5] = msisdn;

            // заполним соты
            String REC_TYPE=record[0].replaceFirst("^0+(?!$)", "");
            record[19] = REC_TYPE + String.valueOf("000020");
            record[20] = REC_TYPE + String.valueOf("000021");
            record[21] = REC_TYPE + String.valueOf("000022");
            record[22] = REC_TYPE + String.valueOf("000023");

            records[i] = record;
            //System.out.println(records[1][1]);
            for (int j = 0; j < 49; j++) {
                pw.write(records[i][j] + ",");
                System.out.print(records[i][j] + ",");
            }
            pw.write("\n");
            System.out.print("\n");
        }
//
//        for (int i=100; i<120; i++) {
//            //REC_TYPE 85 Интернет траффик
//            85,1953590131,,,250022203046371,79222448820,,20180819224756,130090,19,,,,3530670907507520,,6,,,,5906,151153927,,,,,,INTERNET,,,26454768,,,,,,,,83.149.61.114,83.149.61.130,,,,,,,,,,url_cdr_PGW_01_23480230.dat,,90061,40029,,,,,,,,,320,
//
//                    String[] record = {"23","12397629","","","","79087440631","611","20180802162910","0000","00000015","8","","","","","","","","","","","","","","","","611","","8","","306","0","","","","","","79262000601","MSS01_1.20180424163500CF0342.DAT","","","","","","","","","","",""};
//            record[1] = String.valueOf(Long.parseLong(record[1]) + i-99);// меняем номер записи
//            record[5] = String.valueOf(Long.parseLong(record[5].substring(0, 3)) + i-99) + record[5].substring(3);// меняем sourse number
//            record[7] = String.valueOf(Long.parseLong(record[7]) + (i-99) * 1010101);// меняем дату звонка
//            record[8] =  String.valueOf(i) ;//record[8].substring(0, 4) + (i-99);
//            record[9] = String.valueOf(Long.parseLong(record[9].substring(0, 3)) + i-99) + record[9].substring(3);// меняем sourse number
//            record[10] = String.valueOf(i);
//            record[5] = msisdn;
//
//            // заполним соты
//            String REC_TYPE=record[0].replaceFirst("^0+(?!$)", "");
//            record[19] = REC_TYPE + String.valueOf("000020");
//            record[20] = REC_TYPE + String.valueOf("000021");
//            record[21] = REC_TYPE + String.valueOf("000022");
//            record[22] = REC_TYPE + String.valueOf("000023");
//
//            records[i] = record;
//            //System.out.println(records[1][1]);
//            for (int j = 0; j < 49; j++) {
//                pw.write(records[i][j] + ",");
//                System.out.print(records[i][j] + ",");
//            }
//
//
//            pw.write("\n");
//            System.out.print("\n");
//        }




        pw.close();
        System.out.println("done!");
    }
}


//  для 2 и 9 сота должна быть в B_AREA: 21, B_CELL: 22,
//        csv.type.01 = TRAFFIC_TYPE: 1,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 6,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26
//        csv.type.02 = TRAFFIC_TYPE: 1,REC_TYPE: 0, IMSI_A: 4, MSISDN: 6,  DIALED: 5,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26
//        csv.type.03 = TRAFFIC_TYPE: 1,REC_TYPE: 0, IMSI_A: 4, MSISDN: 41,  DIALED: 6,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26
//        csv.type.04 = TRAFFIC_TYPE: 1,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 26, START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.05 = TRAFFIC_TYPE: 1,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 6,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26
//        csv.type.08 = TRAFFIC_TYPE: 2,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 6,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26
//        csv.type.09 = TRAFFIC_TYPE: 2,REC_TYPE: 0, IMSI_A: 4, MSISDN: 26, DIALED: 5, START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31, A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.11 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 26, DIALED: 5,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.12 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 26, START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.13 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 26, DIALED: 5,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 30, CIRCUIT_OUT: 31,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.14 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 26, START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.15 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 26, DIALED: 5,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.16 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 26, START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.17 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5, DIALED: 26,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.18 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 26, START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.19 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 26, DIALED: 5,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.21 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 6,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:6
//        csv.type.22 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 6,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26
//        csv.type.23 = TRAFFIC_TYPE: 3,REC_TYPE: 0, IMSI_A: 4, MSISDN: 5,  DIALED: 6,  START_TIME: 7, DURATION: 8, SUCCESS:9, IMEI_A: 13, MCC_MNC: 37, CIRCUIT_IN: 39, CIRCUIT_OUT: 40,  A_AREA: 19, A_CELL: 20, B_AREA: 21, B_CELL: 22, CALL_ID: 1, A_FORWARD:26



//    Состав bis+
//        Описание и порядок полей bis+ представлен в таблице. К сожалению, далеко не все значения поддаются качественной расшифровке.
//
//        Номер поля	Имя поля	Расшифровка	Значение
//        1 	REC_TYPE	Код записи.15- разовые; 16- периодические;17- трафиковые; 18 – прочие Целое, ненулевое
//        2	    REC_NUMBER	id записи	Целое, ненулевое
//        3	    REC_STATUS	Статус частичной записи
//        4	    REC_SUB_NUM	Номер частичной учетной записи
//        5	    IMSI	Международный идентификатор мобильного абонента	Строка, ненулевое
//        6	    MSISDN	Номер мобильного абонента цифровой сети с интеграцией служб для связи в стандартах GSM, UMTS и пр./ Идентификатор абонента в системе расчётов	Строка, ненулевое
//        7	    DIALLED	Б-номер (вызываемый)	Строка, ненулевое
//        8	    START_TIME	Время начала вызова в формате «yyyymmddhhmiss»	Строка, ненулевое
//        9	    DURATION	Продолжительность соединения (в секундах) или объем услуги	Целое
//        10	SUCCESS	Код причины завершения вызова
//        11	DD_TYPE	Количество дней предоставления услуги
//        12	CALL_TYPE	Размер объема услуги представленной в поле 9   «DURATION» (штуки,    Гигабайты, потоки и т.д.).  Единицы измерения  Строка, ненулевое
//        13	A_FORWARD	А-номер (вызывающий)
//        14	IMEI	Международный идентификатор оборудования связи
//        15	MS_CLASS	Идентификатор профиля
//        16	TYPE_1_SER	Тип основной услуги. Идентификатор основной услуги	Строка, ненулевое
//        17	CODE_1_SER	Код основной услуги. Идентификатор детализированной  услуги
//        18	TYPE_2_SER	Тип дополнительной услуги
//        19	CODE_2_SER	Код дополнительной услуги
//        20	A_AREA	Идентификатор Location Area абонента А	Строка, ненулевое
//        21	A_CELL	Идентификатор ячейки абонента А
//        22	B_AREA	Идентификатор Location Area абонента В
//        23	B_CELL	Идентификатор ячейки абонента В
//        24	ACTION	Поле кода управления услугой (Subscriber-controlled input)
//        25	SERV_CODE	Действия со вспомогательной услугой
//        26	REASON	Код причины переадресации
//        27	CALLED_NUMBER	Реальный номер, с которым установлено соединение (в случае переадресации – номер, на который переадресован вызов). Непреобразованный номер В.
//        28	SUBS_CODE	Код коллективного пользователя
//        29	PASSWORD	Признак предоставления связи через пароль
//        30	INST_ID	Условный номер, в котором производятся расчеты с Клиентом	Строка, ненулевое
//        31	CIRCUIT_IN	Строка, ненулевое
//        32	CIRCUIT_OUT	Номер (мнемоника) исходящего транка
//        33	MSC_ID_LONG	Номер (ID) первого коммутатора
//        34	GLUING_STATUS	Поле характеризует режим склейки для длинной записи
//        35	A_NUMBER_LONG	Физический номер абонента А из записи последнего коммутатора
//        36	CIRCUIT_IN_LONG	Входящий транк из записи последнего коммутатора. Поле заполняется для склеенной записи
//        37	CIRCUIT_OUT_LONG	Исходящий транк из записи первого коммутатора. Поле заполняется для склеенной записи
//        38	MSC_ID	Номер (ID) коммутатора
//        39	Source IP	IP-адрес источника вызова
//        40	Destination IP	IP-адрес точки терминации вызова
//        41	UDF	Пользовательское поле. Название основной/детализированной услуги (текст)	Строка, ненулевое
//        42	A_category	Категория абонента А
//        43	B_subsc_type	Тип вызываемого абонента
//        44	PPIMARY_ID	Уникальный идентификатор звонка.
//        45	А_type	Тип поля 46
//        46	T_klass	Идентификатор тарифного класса, применяемого для данной услуги	Строка, ненулевое
//        47	Trial_period	Признак пробного периода	0 – не пробный, 1 — пробный
//        48	Reserved
//
//
//        Значение в поле может отсутствовать. В качестве разделителя полей используется запятая. Таким образом, типичные записи в формате bis+ выглядят следующим образом:
//
//        21,682420737,,,,,79299306653,20150731234308,106,,05,,74996382133,,1,00,11,,,,,,,,,,,1,,,H/323,H/264,,,,,, 255,2,2,0,,,,,,,
//
//        21,682420738,,,,,74955395454,20150731233641,103,,01,,74955393000,,1,00,11,,,,,,,,,,,1,,,H/323,H/264,,,,,, 255,2,2,0,,,,,,,
//
//        21,682420739,,,,,74957777777,20150731232456,100,,03,,78002222222,,1,00,11,,,,,,,,,,,1,,,H/323,H/264,,,,,, 255,2,2,0,,,,,,,