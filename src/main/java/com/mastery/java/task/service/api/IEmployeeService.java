package com.mastery.java.task.service.api;

import com.mastery.java.task.dto.Employee;

import java.util.List;

public interface IEmployeeService {
    /**
     * Создает нового клиента
     * @param employee - клиент для создания
     */
    void create(Employee employee);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<Employee> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    Employee read(long id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param employee - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Employee employee, long id);

    /**
     * Удаляет клиента с заданным ID
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(long id);
}
