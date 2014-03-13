
/**
 * Author: Alexandre Koubenski
 * 
 * Интерфейс, задающий абстрактный тип данных "очередь"
 */
public interface Queue<T> {
  /** 
   * Поставить в очередь элемент в хвост
   * @param e - элемент, добавляемый в очередь
   * @return элемент, только что поставленный в очередь
   */
  T enqueue(T e);
  
  /**
   * Удалить из очереди головной элемент
   * @return удаленный элемент
   */
  T dequeue();
  
  /**
   * Взять первый элемент очереди
   * @return первый элемент очереди
   */
  T head();
  
  /**
   * Взять последний элемент очереди
   * @return последний элемент очереди
   */
  T tail();
  
  /**
   * Проверить, пуста ли очередь
   * @return true, если очередь пуста, false в противном случае
   */
  boolean empty();
}
