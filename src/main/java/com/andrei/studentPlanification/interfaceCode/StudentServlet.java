//package interfaceCode;
//
//import jakarta.servlet.Servlet;
//import model.Student;
//import service.StudentService;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.annotation.WebServlet;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//@Component
//@WebServlet(urlPatterns = "/studentServlet", loadOnStartup = 1)
//public class StudentServlet extends HttpServlet implements Servlet {
//
//    @Autowired
//    private StudentService studentService;
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//
//        out.println("<html><body>");
//        out.println("<h2>Student Operations - Servlet</h2>");
//        out.println("<form action='/studentServlet' method='post'>");
//        out.println("ID: <input type='text' name='id'><br>");
//        out.println("<input type='submit' name='action' value='View All Students'>");
//        out.println("<input type='submit' name='action' value='Search Student'>");
//        out.println("<input type='submit' name='action' value='Delete Student'>");
//        out.println("</form>");
//        out.println("</body></html>");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String action = req.getParameter("action");
//        PrintWriter out = resp.getWriter();
//
//        try {
//            switch (action) {
//                case "View All Students":
//                    List<Student> students = studentService.getAllStudents();
//                    out.println("<h1>Students:</h1>");
//                    students.forEach(student -> out.printf("<p>%s - %s</p>%n", student.getName(), student.getGroup()));
//                    break;
//                case "Search Student":
//                    long id = Long.parseLong(req.getParameter("id"));
//                    Student student = studentService.getStudentById(id).orElse(null);
//                    out.printf("<p>Found Student: %s - %s</p>%n", student != null ? student.getName() : "None", student != null ? student.getGroup() : "");
//                    break;
//                case "Delete Student":
//                    id = Long.parseLong(req.getParameter("id"));
//                    studentService.deleteStudent(id);
//                    out.println("<p>Student Deleted</p>");
//                    break;
//            }
//        } catch (NumberFormatException e) {
//            out.println("<p>Error: Invalid input for ID.</p>");
//        }
//        out.println("<a href='/studentServlet'>Back</a>");
//    }
//
//}


