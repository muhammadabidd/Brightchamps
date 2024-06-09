from flask import Flask, render_template, request


app = Flask(__name__)



@app.route('/', methods = ['GET', 'POST'])
def calculator():
    result = None

    print("The Method of this is : ")
    print(request.method)
    print(request.form)
    if request.method == 'POST':
        num1 = float(request.form['num1'])
        num2 = float(request.form['num2'])
        operation = request.form['operation']
        if operation == 'add':
            result = num1 + num2
        if operation == 'sub':
            result = num1 - num2
        if operation == 'mult':
              result = num1 * num2
        if operation == 'div':
              result = num1 / num2
    




    return render_template('calculator.html', resultbro = result)



