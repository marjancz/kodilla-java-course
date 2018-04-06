package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME1 = "Todo";
    private static final String DESCRIPTION1 = "First task to do";

    @Test
    public void testTaskDaoFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME1, DESCRIPTION1 );
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.delete(id);
    }
}
