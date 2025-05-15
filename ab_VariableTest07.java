public class ab_VariableTest07 {
    public static void main(String[] args) {
        // 班级里有 100 个学员
        int total = 100;
        // 某商品价格 55.55 元
        double price = 55.55;
        // 地球已经诞生超过 46 亿年
        long earthAge = 46_000_000_000L;
        // “5 是偶数”这句话是假的
        boolean isEven = false;

        System.out.println("班级里有 " + total + " 个学员");
        System.out.println("某商品价格 " + price + " 元");
        System.out.println("地球已经诞生超过 " + earthAge + " 年");
        System.out.println("5 是偶数 " + isEven);
    }
}
