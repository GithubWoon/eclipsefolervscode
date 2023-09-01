public class Main {
    public static void main(String[] args)
        Car car = new Car("Hyndai", 20.5f);

        // 시동 켜기
        car.switchOn();
        while(true) {
            // 가속페달 밟기
            int iRet = car.accerlate();
            // 차량 정보 출력
            car.displayCarInfo();
            if(iRet == 0) {
                if(연료를 채울까)
                else {연료를 채우지말자. break;}
                break;
            }
        }
        // 시동 끄기
        car.swtichOff();
    }