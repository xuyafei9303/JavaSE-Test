package com.ixyf.example.innerClass;

/**
 * 匿名内部类
 * 通过继承一个父类或者实现一个接口的方式直接定义并使用的接口
 * 匿名内部类没有class关键字，这是因为匿名内部类直接使用new生成一个对象的引用
 */
public abstract class OutClass004 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int workTime();

    public static class Test {
        public void test(OutClass004 outClass004) {
            System.out.println(outClass004.getName() + "工作时间：" + outClass004.workTime());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        // 在方法中定义并使用匿名内部类
        test.test(new OutClass004() {
            @Override
            public int workTime() {
                return 8;
            }
            public String getName() {
                return "xyf";
            }
        });
    }

    /**
     * 上面代码中首先定义了一个抽象类OutClass004和一个抽象方法workTime
     * 然后定义了一个test类，在test类中定义了一个方法，该方法接收一个worker参数
     * 在需要一个根据不同场景有不同实现的匿名内部类时，直接在test方法中新建匿名内部类并重写相关方法即可
     */
}
