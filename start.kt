import java.awt.Color
import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

fun main(){
    var window = JFrame()
    window.setSize(800, 600)
    window.contentPane = Game()
    window.isVisible = true
}

class Game : JPanel(){
    override fun paintComponent(g: Graphics) {
        g.color = Color.BLUE
        g.fillRect(370,35,50,50) // шапка
        g.color = Color.BLACK
        g.fillOval(345,57,100,100) // голова
        g.fillOval(325,155,150,150) // туловище
        g.fillOval(300,300,200,200) // ноги
        g.color = Color.BLUE
        var y = 175
        for(i in 0..5) // пуговки
        {
            g.fillOval(389, y, 15, 15)
            y += 45
        }
        g.color = Color.BLACK
        g.drawLine(410, 155, 280, 185) // левая рука
        g.drawLine(410, 155, 510, 185) // правая рука
    }
}
