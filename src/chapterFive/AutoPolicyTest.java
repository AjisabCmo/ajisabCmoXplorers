package chapterFive;

import com.google.common.util.concurrent.CycleDetectingLockFactory;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111,"toyota","Nj");
        AutoPolicy policy2 = new AutoPolicy(2222222, "ford fusion","MA");
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);

    }

    private static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy: ");
        System.out.printf("Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}
