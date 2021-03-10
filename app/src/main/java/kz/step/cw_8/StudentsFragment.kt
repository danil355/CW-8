package kz.step.cw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


public class StudentsFragment : Fragment() {

    var listNames: ArrayList<Student> = arrayListOf(Student("Башков", "Данил", "Ученик ...."),
        Student("Дудник", "Дмитрий", "Ученик ...."),
        Student("Воробьев", "Юра", "Ученик ...."),
        Student("Акиласов", "Арлан", "Ученик ...."),
        Student("Ильчук", "Григорий", "Ученик ...."),
        Student("Махамбетов", "Асхат", "Ученик ...."),
        Student("Лущенко", "Алексей", "Ученик ...."),
        Student("Смаглюк", "Владислав", "Ученик ...."),
        Student("Симчук", "Артем", "Ученик ...."),
        Student("Сенников", "Александр", "Ученик ...."),
        Student("Соловьев", "Данил", "Ученик ...."),
        Student("Фищук", "Даниил", "Ученик ...."),
        Student("Шефер", "Арон", "Ученик ...."),
        Student("Майданов", "Асар", "Ученик ...."),
        Student("Рамазанов", "Диас", "Ученик ....")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_students, container, false)
    }

    public fun InfoStudents(): String {
        var info: String = ""
        for(l in listNames)
        {
            info += l.name + "  " + l.surname + l.info + "\n"
        }
        return info
    }

}