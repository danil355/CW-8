package kz.step.cw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

private const val ARG_PARAM1 = "Фото"
private const val ARG_PARAM2 = "Фамилия и Имя студента"
private const val ARG_PARAM3 = "Описание студента"

class StudentsInformationFragment : Fragment() {
    private var imageView: ImageView? = null
    private var textViewNameOfStudent: TextView? = null
    private var textViewInfoOfStudent: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_students_information, container, false)

        imageView = rootView.findViewById(R.id.photo_student)
        textViewNameOfStudent = rootView.findViewById(R.id.textview_name_student)
        textViewInfoOfStudent = rootView.findViewById(R.id.textview_info_student)

        initializeLiseners()

        return rootView
    }

    public fun initializeLiseners() {
        var infoStudent: StudentsFragment = StudentsFragment()
        textViewInfoOfStudent?.text = infoStudent.InfoStudents()

    }
}