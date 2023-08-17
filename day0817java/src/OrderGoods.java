public class OrderGoods {
    
    int optimalStock1; // 적정 재고
    int optimalStock2;
    int currentStock1; // 현재 재고
    int currentStock2;

    // 기본 생성자
    public OrderGoods() { 
        
    }

    // 인자있는 생성자
    public OrderGoods(int optimalStock1, int optimalStock2, int currentStock1, int currentStock2) { 
        this.optimalStock1 = optimalStock1;
        this.optimalStock2 = optimalStock2;
        this.currentStock1 = currentStock1;
        this.currentStock2 = currentStock2;
    }

    public void 주문처리() {
        // 주문 처리 로직
    }

    public void 재고보충() {
        // 재고 보충 로직
    }

    public void 재고출력() {
        // 재고 출력 로직
    }
}
