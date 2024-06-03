from flask import Flask
# import os 



app = Flask(__name__)

print(__name__)
print(app)
# print(__file__)
# print(os.path.basename(__file__))

name = "Abid"

@app.route('/')
def hello_world():
    return f"Hello world, My name is {name}"


if __name__  =='__main__':
    app.run()