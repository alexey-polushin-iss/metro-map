//
//  ViewController.swift
//  SybwayMap
//
//  Created by Roman on 09.11.2020.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var metroScreenButton: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        setupUI()
    }
    
    private func setupUI() {
        title = "Metro Screen"
        
        metroScreenButton.backgroundColor = UIColor(red: 222.0/255.0, green: 53.0/255.0, blue: 46.0/255.0, alpha: 1.0)
        metroScreenButton.layer.cornerRadius = metroScreenButton.frame.height / 2
    }
    
    // MARK: Actions

    @IBAction func metroScreenButtonAction(_ sender: Any) {
        let metroScreen = MetroScreenController()
        
        navigationController?.pushViewController(metroScreen, animated: true)
    }
    
}

