import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
     * @Cria a lista de teste.
     */
class ListTest {

    @Test
    public void testAddQuestion() {
        List list = new List();
        Question question = new Question(1, "What is the capital of France?", "Paris", "Berlin", 1);
        list.addQuestion(question);
        LinkedList<Question> questions = list.getQuestions();
        assertTrue(questions.contains(question));
    }
/**
     * @Remove questões.
     */
    @Test
    public void testRemoveQuestion() {
        List list = new List();
        Question question = new Question(1, "What is the capital of France?", "Paris", "Berlin", 1);
        list.addQuestion(question);
        list.removeQuestion(question);
        LinkedList<Question> questions = list.getQuestions();
        assertFalse(questions.contains(question));
    }

    @Test
    public void testGetQuestions(){
        List list = new List();
        Question question1 = new Question(1, "What is the capital of France?", "Paris", "Berlin", 1);
        Question question2 = new Question(2, "What is 2+2?", "4", "5", 1);
        list.addQuestion(question1);
        list.addQuestion(question2);
        LinkedList<Question> questions = list.getQuestions();
        assertEquals(2, questions.size());
    }
/**
     * @adição de questão nula.
     */
    @Test
    public void testAddNullQuestion(){
        List list = new List();
        assertThrows(NullPointerException.class, () -> {
            list.addQuestion(null);
        });
    }
/**
     * @Remove questão nula.
     */
    @Test
    public void testRemoveNonExistingQuestion(){
        List list = new List();
        Question question1 = new Question(1, "What is the capital of France?", "Paris", "Berlin", 1);
        Question question2 = new Question(2, "What is 2+2?", "4", "5", 1);
        list.addQuestion(question1);
        assertFalse(list.removeQuestion(question2));
    }

    @Test
    public void testRemoveQuestionByIndex(){
        List list = new List();
        Question question1 = new Question(1, "What is the capital of France?", "Paris", "Berlin", 1);
        Question question2 = new Question(2, "What is 2+2?", "4", "5", 1);
        list.addQuestion(question1);
        list.addQuestion(question2);
        list.removeQuestion(1);
        LinkedList<Question> remainingQuestions = list.getQuestions();
        assertFalse(remainingQuestions.contains(question2));
    }

  @Test
  public void testAddQuestionMultipleTimes(){
      List list = new List();
      Question question = new Question(1, "What is the capital of France?", "Paris", "Berlin", 1);
      assertTrue(list.addQuestion(question)); // add question for the first time
      assertFalse(list.addQuestion(question)); // try to add the same question again
  }

    @Test
    public void testGetQuestionsWhenListIsEmpty(){
        List list = new List();
        assertTrue(list.getQuestions().isEmpty());
    }

    @Test
    public void testRemoveQuestionWhenListIsEmpty(){
        List list = new List();
        assertFalse(list.removeQuestion(new Question(1, "What is the capital of France?", "Paris", "Berlin", 1)));
    }
/**
     * @Adiciona e Remove questões.
     */
    @Test
    public void testAddAndRemoveQuestion(){
        List list = new List();
        Question question = new Question(1, "What is the capital of France?", "Paris", "Berlin", 1);
        list.addQuestion(question);
        assertTrue(list.removeQuestion(question));
    }

  

}