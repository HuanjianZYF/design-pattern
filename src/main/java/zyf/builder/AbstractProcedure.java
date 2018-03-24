package zyf.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午3:49
 * 类似模板方法的一个待完整的产品，step由子类实现，sequence由builder来注入
 */
public abstract class AbstractProcedure {

    private List<Integer> sequence = new ArrayList<Integer>();

    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();
    protected abstract void step4();

    public void setSequence(List<Integer> sequence) {
        this.sequence = sequence;
    }

    public void execute() {
        if (sequence != null && sequence.size() != 0) {
            for (Integer code : sequence) {
                if (code.equals(BuilderConstant.STEP1_CODE)) {
                    step1();
                } else if (code.equals(BuilderConstant.STEP2_CODE)) {
                    step2();
                } else if (code.equals(BuilderConstant.STEP3_CODE)) {
                    step3();
                } else if (code.equals(BuilderConstant.STEP4_CODE)) {
                    step4();
                } else {
                }
            }
        }
    }

}
