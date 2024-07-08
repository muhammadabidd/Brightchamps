from flask import Flask, request, render_template, redirect, url_for
from flask_sqlalchemy import SQLAlchemy
import os



app = Flask(__name__)


basedir = os.path.abspath(os.path.dirname(__file__))
database_file = os.path.join(basedir, 'database', 'students.sqlite3')


app.config['SQLALCHEMY_DATABASE_URI'] = f'sqlite:///{database_file}'
app.config['SECRET_KEY'] = '123456'

db = SQLAlchemy(app)

# print(app.config.keys())
# print(app.config.values())


class students (db.Model):
    id = db.Column(db.Integer, primary_key = True)
    Name = db.Column(db.String(100))
    Age = db.Column(db.Integer)
    DOB = db.Column(db.String(100))
    Gender = db.Column(db.String(100))


    def __init__(self, name, age, dob, gender):
        self.Name = name
        self.Age = age
        self.DOB = dob
        self.Gender = gender

    

@app.route('/', methods = ['GET', "POST"])
def add_students():

    print("The request method is : " + request.method)

    if request.method == 'POST':
        print("abid ganteng, POST")

        name = request.form['name']
        age = request.form['age']
        dob = request.form['dob']
        gender = request.form['gender']

        student = students(name, age, dob, gender)

        db.session.add(student)
        db.session.commit()
        return redirect(url_for('show_details'))
        





    return render_template('addstudents.html')


@app.route('/show_details')
def show_details():
    Students = students.query.all()

    return render_template('show_details.html', students = Students)





if __name__ == "__main__":

    os.makedirs(os.path.dirname(database_file), exist_ok=True)
    with app.app_context():
        db.create_all()
        app.run(debug = True)