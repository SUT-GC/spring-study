package first.bean.impl;

import first.bean.Quest;

public class MockQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Mock Quest embark....");
    }
}
