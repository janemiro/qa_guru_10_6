package allure;

import allure.steps.WebSteps;
import org.junit.jupiter.api.Test;

public class StepAnnotatedTest {

    private static final String REPOSITORY = "janemiro/qa_guru_10_6";
    private static final String ISSUE_NAME = "Telefffizor";


    private WebSteps steps = new WebSteps();

    @Test
    public void TestOfIssueName() {
        steps.openUrl();
        steps.searchForRepo(REPOSITORY);
        steps.goToRepo(REPOSITORY);
        steps.openIssueTab();
        steps.shouldSeeIssueWithName(ISSUE_NAME);

    }
}
