package zyf.builder;

import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午4:01
 */
public interface IProcedureBuilder {

    AbstractProcedure getAbstractProcedure();
    void setSequence(List<Integer> sequence);
}
