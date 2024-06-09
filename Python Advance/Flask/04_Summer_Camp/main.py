from flask import Flask, request, render_template
from flask_sqlalchemy import SQLAlchemy



app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///students.sqlite3'
app.config['SECRET_KEY'] = '123456'

db = SQLAlchemy(app)

print(app.config.keys())
print(app.config.values())

@app.route('/')
def starting():
    return "it is connected"




if __name__ == "__main__":
    app.run(debug = True)